package design_pattern.singleton_design_pattern.singletonPackage;

public class AppStart {
    public static void main(String[] args) {
        System.out.println("Hi i am running!....");

        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.equals(singleton2));


    }
}
