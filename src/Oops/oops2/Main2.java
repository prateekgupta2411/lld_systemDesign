package Oops.oops2;

class MethodOverriding {
    void display() {
        System.out.println("Parent class display method");
    }
}

class MethodOverriding1 extends MethodOverriding {
    void display() {
        System.out.println("Child class display method");
    }
}

public class Main2 {
    public static void main(String[] args) {
        MethodOverriding1 obj = new MethodOverriding1();
        obj.display(); // Calls the child class display method
    }
}
