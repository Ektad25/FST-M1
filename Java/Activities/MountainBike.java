package activities;

public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int speed, int seatHeight){
        super(gears, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + "\nSeat Hieght is " + seatHeight);
    }
}
