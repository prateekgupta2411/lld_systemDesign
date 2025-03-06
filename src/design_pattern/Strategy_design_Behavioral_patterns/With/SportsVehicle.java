package design_pattern.Strategy_design_Behavioral_patterns.With;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
