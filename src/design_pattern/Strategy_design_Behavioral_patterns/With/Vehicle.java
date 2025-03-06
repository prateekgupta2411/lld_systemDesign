package design_pattern.Strategy_design_Behavioral_patterns.With;

public class Vehicle {
    DriveStrategy driveObject;

    //this is known as constructor injection
    Vehicle(DriveStrategy driveObject){
        this.driveObject = driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}
