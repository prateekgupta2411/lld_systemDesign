package design_pattern.factory_method_design_pattern;

abstract class Pizza {
    abstract void prepare();
}

class VegPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing Veg Pizza 🍕");
    }
}

class ChickenPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing Chicken Pizza 🍗");
    }
}

abstract class PizzaStore {
    abstract Pizza createPizza();  // Factory Method
}

class VegPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza() {
        return new VegPizza();  // Child class decides to create VegPizza
    }
}

class ChickenPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza() {
        return new ChickenPizza();  // Child class decides to create ChickenPizza
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        PizzaStore vegStore = new VegPizzaStore();
        Pizza vegPizza = vegStore.createPizza();
        vegPizza.prepare();  // Output: Preparing Veg Pizza 🍕

        PizzaStore chickenStore = new ChickenPizzaStore();
        Pizza chickenPizza = chickenStore.createPizza();
        chickenPizza.prepare();  // Output: Preparing Chicken Pizza 🍗
    }
}

