package pl.sda.rav;

public class vehicles {

     private int vin;
     private String name;
     private int YearOfProduction;

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

    public vehicles(int vin, String name, int yearOfProduction) {
        this.vin = vin;
        this.name = name;
        this.YearOfProduction = yearOfProduction;
    }
}
