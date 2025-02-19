package design_pattern.singleton_design_pattern.singletonPackage;

public class Samosa {

    private static Samosa samosa;
    // private constructor
    private Samosa(){
    }
    // lazy way to creating a singleton object // no thread safety consern use this way only one thread safe if multiple thead
    // can create multiple object but it will not lead to thread safety problem
    // thread ek sath execute hote he concurrent execution hota he to agr T1 and T2 two thread too two obj ban jayege
    // ek tarika he ki method me Synchronization lga doo but ye achcha tarika nhi he hame to block Synchronization krna he.
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