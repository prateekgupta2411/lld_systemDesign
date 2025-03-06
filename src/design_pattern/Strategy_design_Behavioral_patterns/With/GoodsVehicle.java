package design_pattern.Strategy_design_Behavioral_patterns.With;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
