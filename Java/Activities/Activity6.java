package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Priyanka");
        plane.onboard("Lari");
        plane.onboard("Supriya");
        plane.onboard("Abhishek");
        plane.onboard("Ekta");
        System.out.println("Plane take off time: " +plane.takeOff());
        System.out.println("People on plane :" +plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane Landed time: " +plane.getLastTimeLanded());
    }
}
