import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception {

        // Singleton Design Pattern

        /*
         * SingleTon single = SingleTon.getsingleTon();
         * 
         * SingleTon single2 = SingleTon.getsingleTon();
         * 
         * int firstHash = single.hashCode();
         * 
         * int secondHash = single2.hashCode();
         * 
         * if (firstHash == secondHash) {
         * System.out.println("Both hashes and objects are equal");
         * }
         */

        // Breaking SingleTon Pattern Using Reflection API

        /*
         * SingleTon s1 = SingleTon.getsingleTon();
         * System.out.println(s1.hashCode());
         * 
         * Constructor<SingleTon> con = SingleTon.class.getDeclaredConstructor();
         * con.setAccessible(true);
         * SingleTon s2 = con.newInstance();
         * System.out.println(s2.hashCode());
         * 
         * 
         */

        // Breaking SingleTon Pattern Using Serialization/DeSerialization

        /*
         * SingleTon s3 = SingleTon.getsingleTon();
         * ObjectOutputStream os = new ObjectOutputStream(new
         * FileOutputStream("abc.ob"));
         * os.writeObject(s3);
         * 
         * System.out.println("Serialization Done");
         * 
         * ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.ob"));
         * SingleTon s4 = (SingleTon) is.readObject();
         * 
         * System.out.println(s3.hashCode());
         * System.out.println(s4.hashCode());
         * 
         *
         */

        // Breaking SingleTon Pattern Using cloning

        SingleTon s5 = SingleTon.getsingleTon();

        SingleTon s6 = (SingleTon) s5.clone();

        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());

    }

}
