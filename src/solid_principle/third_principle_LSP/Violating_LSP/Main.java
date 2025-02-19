package solid_principle.third_principle_LSP.Violating_LSP;

class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow extends Bird {
    // Sparrow can fly, so no issue here.
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly(); // Works fine.

        Bird penguin = new Penguin();
        penguin.fly(); // Throws an exception! This violates LSP.
    }
}