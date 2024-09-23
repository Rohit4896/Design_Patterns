import java.io.Serializable;

import javax.management.RuntimeErrorException;

public class SingleTon implements Serializable {

    private static SingleTon singleTon;

    private SingleTon() {

        // For Not Breaking SingleTon Pattern Using Reflection API

        if (singleTon != null) {
            throw new RuntimeException("You Are trying to break SingleTon Pattern ");
        }

    }

    public static SingleTon getsingleTon() {
        if (singleTon == null) {

            // For Thread Safty
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }

        }

        return singleTon;
    }

    // Soltion Of breaking SingleTon Pattern Using serialization and deserialization
    /*
     * The readResolve method in Java is a special method used in the
     * deserialization process. It is called when an object is deserialized and
     * is part of the Serializable interface mechanism. The primary purpose of the
     * readResolve method is to provide a way for the class to replace the
     * deserialized object with another object (typically a singleton or an
     * existing instance) during deserialization.
     */
    public Object readResolve() {

        return singleTon;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return singleTon;
    }
}
