package solid_principle.second_principle_OCP.Following_OCP;

// Step 1: Define a common interface for all coffee types
interface Coffee {
    void make();
}

// Step 2: Implement different coffee types separately
class BlackCoffee implements Coffee {
    @Override
    public void make() {
        System.out.println("Making black coffee...");
    }
}

class Cappuccino implements Coffee {
    @Override
    public void make() {
        System.out.println("Making cappuccino...");
    }
}

class Latte implements Coffee {
    @Override
    public void make() {
        System.out.println("Making latte...");
    }
}

// Step 3: CoffeeMachine class now remains unchanged!
class CoffeeMachine {
    public void brewCoffee(Coffee coffee) {
        coffee.make();
    }
}

// Step 4: Test the implementation
public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        Coffee blackCoffee = new BlackCoffee();
        Coffee cappuccino = new Cappuccino();
        Coffee latte = new Latte();

        machine.brewCoffee(blackCoffee);
        machine.brewCoffee(cappuccino);
        machine.brewCoffee(latte);
    }
}

