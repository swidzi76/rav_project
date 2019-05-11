package pl.sda.rav;

public class Motorboats extends Vehicles {
    private int displacement;
    private int maxDistance;

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

    public Motorboats(String brand, int displacement, int maxDistance) {
        super(brand);
        this.displacement = displacement;
        this.maxDistance = maxDistance;
    }

    public Motorboats(int vin, String name, int yearOfProduction, int displacement, int maxDistance) {
        super(vin, name, yearOfProduction);
        this.displacement = displacement;
        this.maxDistance = maxDistance;
    }

    public Motorboats(int vin, String name, int yearOfProduction) {
        super(vin, name, yearOfProduction);
    }
}
