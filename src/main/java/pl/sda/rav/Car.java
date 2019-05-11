package pl.sda.rav;

public class Car extends Vehicles {

   private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int vin, String name, int yearOfProduction, int maxSpeed) {
        super(vin, name, yearOfProduction);
        this.maxSpeed = maxSpeed;
    }
}
