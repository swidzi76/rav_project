package pl.sda.rav;

public class Amphibian extends Vehicles {

    private int maxSpeed;
    private int maxDistanceMiles;
    private int displacement;



    public Amphibian(int vin, String name, int yearOfProduction,String brand, int maxSpeed, int maxDistanceMiles, int displacement) {
        super(vin, name, yearOfProduction,brand);
        this.maxSpeed = maxSpeed;
        this.maxDistanceMiles = maxDistanceMiles;
        this.displacement = displacement;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxDistanceMiles() {
        return maxDistanceMiles;
    }

    public void setMaxDistanceMiles(int maxDistanceMiles) {
        this.maxDistanceMiles = maxDistanceMiles;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }


    public Amphibian(int vin, String name, int yearOfProduction, String brand) {
        super(vin, name, yearOfProduction, brand);
    }
}
