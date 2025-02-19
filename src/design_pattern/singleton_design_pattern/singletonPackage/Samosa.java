package design_pattern.singleton_design_pattern.singletonPackage;

public class Samosa {

    private static Samosa samosa;
    // private constructor
    private Samosa(){
    }
    // lazy way to create a singleton object
    public static Samosa getSamosa(){
        // Object of this class
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }

}
/*
*1. constructor private
*
*2. object create with the help of method(factory method)
*
* 3. create field to store object is private
*
 */