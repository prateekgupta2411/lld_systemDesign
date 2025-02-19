package design_pattern.singleton_design_pattern.Ways3_To_Break_Singleton_Pattern;

import singletonPackage.Samosa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Rashmilai rashmilai1 = Rashmilai.getRashmilai();
//        Rashmilai rashmilai2 = Rashmilai.getRashmilai();
//        System.out.println(rashmilai1.hashCode());
//        System.out.println(rashmilai2.hashCode());

        /*
        *1. reflection API to break singleton pattern
        *
        *
        *
         */

        Rashmilai r1 = Rashmilai.getRashmilai();
        System.out.println(r1.hashCode());

        Constructor<Rashmilai> constructor = Rashmilai.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Rashmilai r2 = constructor.newInstance();
        System.out.println(r2.hashCode());
    }
}
