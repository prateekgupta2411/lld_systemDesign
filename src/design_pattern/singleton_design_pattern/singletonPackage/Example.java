package design_pattern.singleton_design_pattern.singletonPackage;

public class Example {
    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getSamosa();
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        System.out.println(samosa2.hashCode());

        Jalebi jalibi1 = Jalebi.getJalebi();
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalibi1);
        System.out.println(jalebi2);

        System.out.println(Rasgulla.getRasgulla().hashCode());
        System.out.println(Rasgulla.getRasgulla().hashCode());
    }
}
