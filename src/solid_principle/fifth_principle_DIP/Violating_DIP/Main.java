package solid_principle.fifth_principle_DIP.Violating_DIP;

// Low-level module
class SonyTV {
    public void turnOn() {
        System.out.println("Sony TV: Turning ON");
    }

    public void turnOff() {
        System.out.println("Sony TV: Turning OFF");
    }
}

// High-level module
class RemoteControl {
    private SonyTV tv;

    public RemoteControl(SonyTV tv) {
        this.tv = tv; // Direct dependency on SonyTV
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
        SonyTV sonyTV = new SonyTV();
        RemoteControl remote = new RemoteControl(sonyTV);

        remote.turnOnTV();  // Works fine
        remote.turnOffTV(); // Works fine
    }
}
