package withOut_ISP;


//Example Without ISP (Interface Segregation Principle Violated)
//
//        Maan lo, humare paas ek Machine interface hai jo kuch methods define karta hai:

//Problem:
//
//Yahan Printer class ko Machine interface se scan() aur fax() methods ko implement karne ke liye force kiya gaya hai,
// lekin Printer class ko in methods ki zarurat nahi thi. Isse program mein errors aa rahe hain.
// Big interface with many methods
interface Machine {
    void print();
    void scan();
    void fax();
}

class Printer implements Machine {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        // Error: Printer does not scan
        throw new UnsupportedOperationException("Printer cannot scan");
    }

    @Override
    public void fax() {
        // Error: Printer does not fax
        throw new UnsupportedOperationException("Printer cannot fax");
    }
}

public class Main {
    public static void main(String[] args) {
        Machine printer = new Printer();
        printer.print(); // This works fine
        printer.scan(); // This will throw an error
        printer.fax(); // This will throw an error
    }
}

