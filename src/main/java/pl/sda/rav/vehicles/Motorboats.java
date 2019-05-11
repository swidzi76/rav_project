package pl.sda.rav.vehicles;

public class Motorboats extends Vehicles {
    private int displacement;
    private int maxDistance;

    public Motorboats(int vin, String name, int yearOfProduction, String brand, int displacement, int maxDistance) {
        super(vin, name, yearOfProduction, brand);
        this.displacement = displacement;
        this.maxDistance = maxDistance;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }



    public Motorboats(int vin, String name, int yearOfProduction, int displacement, String brand) {
        super(vin, name, yearOfProduction, brand );
        this.displacement = displacement;
        this.maxDistance = maxDistance;
    }

}
