package design_pattern.singleton_design_pattern.singletonPackage;

public class Rasgulla {
    private static volatile Rasgulla rasgulla; // volatile ensures visibility across threads

    private Rasgulla() {
        // Private constructor to prevent instantiation
    }

    public static Rasgulla getRasgulla() {
        if (rasgulla == null) {
            synchronized (Rasgulla.class) {  // Synchronization block for thread safety
                if (rasgulla == null) {
                    rasgulla = new Rasgulla();
                }
            }
        }
        return rasgulla;
    }
}

//Why use volatile?
//
//Without volatile, the instance might be partially initialized before another thread accesses it. Using volatile ensures:
//        ✅ Visibility - Other threads immediately see the updated instance.
//✅ Prevents Instruction Reordering - Ensures instance is fully initialized before use.