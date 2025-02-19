package solid_principle.fifth_principle_DIP.Following_DIP;

// Step 1: Define an abstraction (interface)
interface TV {
    void turnOn();

    void turnOff();
}

// Step 2: Implement the abstraction for specific TV brands
class SonyTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("Sony TV: Turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV: Turning OFF");
    }
}

class SamsungTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("Samsung TV: Turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV: Turning OFF");
    }
}

// Step 3: High-level module depends on the abstraction
class RemoteControl {
    private TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv; // Depends on the abstraction (TV interface)
    }

    public void turnOnTV() {
        tv.turnOn();
    }

    public void turnOffTV() {
        tv.turnOff();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        TV sonyTV = new SonyTV();
        RemoteControl remote1 = new RemoteControl(sonyTV);
        remote1.turnOnTV();  // Sony TV: Turning ON
        remote1.turnOffTV(); // Sony TV: Turning OFF

        TV samsungTV = new SamsungTV();
        RemoteControl remote2 = new RemoteControl(samsungTV);
        remote2.turnOnTV();  // Samsung TV: Turning ON
        remote2.turnOffTV(); // Samsung TV: Turning OFF
    }
}
