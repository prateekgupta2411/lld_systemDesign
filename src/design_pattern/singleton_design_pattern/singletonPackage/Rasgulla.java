package design_pattern.singleton_design_pattern.singletonPackage;

public class Rasgulla {
    private static Rasgulla rasgulla;

    private Rasgulla() {

    }

    public static Rasgulla getRasgulla() {
        if (rasgulla == null) {
            // Syncronization Block to create a Singleton Object
            synchronized (Rasgulla.class) {
                if (rasgulla == null) {
                    rasgulla = new Rasgulla();
                }
            }
        }
        return rasgulla;
    }
}
