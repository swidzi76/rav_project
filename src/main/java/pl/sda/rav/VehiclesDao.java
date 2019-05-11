package pl.sda.rav;

import java.util.ArrayList;
import java.util.List;

import static pl.sda.rav.SamplesVehiculs.*;


public abstract class VehiclesDao  {


    List<Vehicles> vehicles = new ArrayList<>();

     public void   add (Vehicles newVehicles){
      vehicles.add(newVehicles);
         vehicles.add(carOne);
         vehicles.add(carTwo);
         vehicles.add(carThre);
         vehicles.add(carFour);
         vehicles.add(carFive);
     }
     public List<Vehicles> getVehicles(){
         List<Vehicles> list = new ArrayList<>(vehicles);
     }




    }

