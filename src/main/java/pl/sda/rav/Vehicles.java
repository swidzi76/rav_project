package pl.sda.rav;

public abstract class Vehicles implements Comparable {
    private int vin;

    private String name;
    private String brand;
     private int YearOfProduction;



    public int getYearOfProduction() {
        return YearOfProduction;
    }

    public Vehicles(int vin, String name, int yearOfProduction, String brand) {
        this.vin = vin;
        this.name = name;
        this.YearOfProduction = yearOfProduction;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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

    public void setYearOfProduction(int yearOfProduction) {
        YearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
