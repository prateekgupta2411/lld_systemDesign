package design_pattern.Strategy_design_Behavioral_patterns.With;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
