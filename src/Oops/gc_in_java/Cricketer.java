package Oops.gc_in_java;

public class Cricketer {
    Cricketer(){
        System.out.println("Cricketer object created");
    }
    protected void finalize() {
        System.out.println("Cricketer object destroyed");
    }
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer();
        cricketer = null; // 1. by assigning The null

        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        c1 = c2;// 2. By assigning the reference to another

        new Cricketer(); // By Anonymous Object
        System.gc(); // Request JVM to run Garbage Collector
    }
}
