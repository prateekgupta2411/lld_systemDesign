package solid_principle.fourth_principle_ISP.Following_ISP;

interface CallFunction {
    void call();

    void sendSMS();
}

interface SmartFeatures {
    void browseInternet();

    void takePhoto();
}

class BasicPhone implements CallFunction {
    public void call() {
        System.out.println("Calling...");
    }

    public void sendSMS() {
        System.out.println("Sending SMS...");
    }
}

class Smartphone implements CallFunction, SmartFeatures {
    public void call() {
        System.out.println("Calling...");
    }

    public void sendSMS() {
        System.out.println("Sending SMS...");
    }

    public void browseInternet() {
        System.out.println("Browsing the Internet...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
}

public class Main {
    public static void main(String[] args) {
        CallFunction basicPhone = new BasicPhone();
        basicPhone.call();
        basicPhone.sendSMS();

        System.out.println("\n--- Using Smartphone ---");
        Smartphone smartphone = new Smartphone(); // Use concrete class reference
        smartphone.browseInternet();
        smartphone.takePhoto();
        smartphone.call();
        smartphone.sendSMS();
    }
}
