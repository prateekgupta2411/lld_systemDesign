package solid_principle.fourth_principle_ISP.Violating_ISP;

interface Phone {
    void call();

    void sendSMS();

    void browseInternet();

    void takePhoto();
}

class BasicPhone implements Phone {
    public void call() {
        System.out.println("Calling...");
    }

    public void sendSMS() {
        System.out.println("Sending SMS...");
    }

    public void browseInternet() {
        throw new UnsupportedOperationException("Basic phones cannot browse the internet!");
    }

    public void takePhoto() {
        throw new UnsupportedOperationException("Basic phones do not have a camera!");
    }
}

public class Main {
    public static void main(String[] args) {
        Phone basicPhone = new BasicPhone();
        basicPhone.call();
        basicPhone.sendSMS();
        basicPhone.browseInternet(); // Throws an UnsupportedOperationException
        basicPhone.takePhoto(); // Throws an UnsupportedOperationException
    }
}
