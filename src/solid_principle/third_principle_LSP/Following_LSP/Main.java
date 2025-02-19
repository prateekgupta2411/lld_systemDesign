package solid_principle.third_principle_LSP.Following_LSP;

// Base class for all birds
class Bird {
    public void eat() {
        System.out.println("Eating...");
    }
}

// Interface for birds that can fly
interface Flyable {
    void fly();
}

// Sparrow can fly, so it implements Flyable
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

// Penguin cannot fly, so it does not implement Flyable
class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming...");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();
        ((Flyable) sparrow).fly();
        Bird penguin = new Penguin();
        penguin.eat();
        ((Penguin) penguin).swim();
    }
}
