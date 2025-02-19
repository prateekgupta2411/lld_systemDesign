package design_pattern.singleton_design_pattern.Ways3_To_Break_Singleton_Pattern;


import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {
//        Rashmilai rashmilai1 = Rashmilai.getRashmilai();
//        Rashmilai rashmilai2 = Rashmilai.getRashmilai();
//        System.out.println(rashmilai1.hashCode());
//        System.out.println(rashmilai2.hashCode());

        /*
         *1. Reflection API to break singleton pattern
         * Haan, Reflection API ka use karke hum dynamically kisi bhi class ya interface ki properties, methods, constructors,
         * and even private members ko access kar sakte hain, even agar wo private bhi ho.
         * // Solution for prevent the Singleton from reflection API
         * solution1 -> if object is there=> throw an exception from inside constructor
         * solution2 -> use Enum (it is a singleton)
         *Breaking Singleton using Cloning
         *Breaking Singleton using Serialization & Deserialization
         */

//        way 1
//        Rashmilai r1 = Rashmilai.getRashmilai();
//        System.out.println(r1.hashCode());
//
//        Constructor<Rashmilai> constructor = Rashmilai.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Rashmilai r2 = constructor.newInstance();
//        System.out.println(r2.hashCode());

        // Ways 2 Enum
//        Rashmilai r1 = Rashmilai.INSTANCE();
//        System.out.println(r1.hashCode());
//        r1.test();
//        Constructor<Rashmilai> constructor = Rashmilai.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Rashmilai r2 = constructor.newInstance();
//        System.out.println(r2.hashCode());
    }
}
