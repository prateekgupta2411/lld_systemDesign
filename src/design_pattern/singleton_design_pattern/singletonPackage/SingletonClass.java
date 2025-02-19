package design_pattern.singleton_design_pattern.singletonPackage;

public class SingletonClass {
    // Static instance of the class
    private static SingletonClass instance = null;

    // Public method to get the instance
    public static SingletonClass getInstance(){
        if(instance == null){
            // Creating new instance if it's null
            instance = new SingletonClass();
        }
        return instance;
    }

    private SingletonClass(){
        // Private constructor to prevent instantiation
    }

}
