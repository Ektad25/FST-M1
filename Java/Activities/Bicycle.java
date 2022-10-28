package activities;

public class Bicycle  implements BicycleParts, BicycleOperations{
    public int gears = 0;
    public int currentSpeed = 0;
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
