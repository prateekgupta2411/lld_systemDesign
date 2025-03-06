package design_pattern.Strategy_design_Behavioral_patterns.With;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
