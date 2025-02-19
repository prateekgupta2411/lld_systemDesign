package solid_principle.second_principle_OCP.Violating_OCP;
// This code does NOT follow OCP because we modify the CoffeeMachine class for each new coffee type.

class CoffeeMachine {
    public void makeBlackCoffee() {
        System.out.println("Making black coffee...");
    }

    public void makeCappuccino() {
        System.out.println("Making cappuccino...");
    }

    public void makeLatte() {
        System.out.println("Making latte...");
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        machine.makeBlackCoffee();
        machine.makeCappuccino();
        machine.makeLatte();
    }
}

