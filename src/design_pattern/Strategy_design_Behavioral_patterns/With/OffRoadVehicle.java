package design_pattern.Strategy_design_Behavioral_patterns.With;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
