package pl.sda.rav;

public abstract class Vehicles {

     private int vin;
     private String name;
     private String brand;
     private int YearOfProduction;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicles(String brand) {
        this.brand = brand;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        YearOfProduction = yearOfProduction;
    }

    public Vehicles(int vin, String name, int yearOfProduction) {
        this.vin = vin;
        this.name = name;
        this.YearOfProduction = yearOfProduction;
    }
}
