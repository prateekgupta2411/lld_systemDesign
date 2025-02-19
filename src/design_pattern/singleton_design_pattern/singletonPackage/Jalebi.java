package design_pattern.singleton_design_pattern.singletonPackage;

public class Jalebi {
    // Eager way to creating a Singleton Object
    private static Jalebi jalebi = new Jalebi();

    private Jalebi(){
    }

    public static Jalebi getJalebi(){
        return  jalebi;
    }
}
