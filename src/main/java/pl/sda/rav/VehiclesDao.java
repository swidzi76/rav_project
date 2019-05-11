package pl.sda.rav;

import java.util.ArrayList;
import java.util.List;


public class VehiclesDao {
    Car carOne = new Car(1,"Car",2017,300,"Mercedes");
    Car carTwo = new Car(2,"Car",2015,260," BMW");
    Car carThre = new Car(3,"Car",2013,160, "Audi");
    Car carFour = new Car(4,"Car",2017,200, "Mercedes");
    Car carFive = new Car(5,"Car",2019,90, "Honda");


    List<Vehicles> vehicles = new ArrayList<>();

     public List<Vehicles> add (Vehicles newVehicles){
      vehicles.add(newVehicles);

         for (Vehicles vehicle : vehicles) {
                int yearOfProduction = vehicle.getYearOfProduction();
                if (vehicles.contains(yearOfProduction)){
                }
                vehicles.get(yearOfProduction);
         }
           return vehicles;
}
    }

