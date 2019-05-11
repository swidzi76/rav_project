package pl.sda.rav.order;

import pl.sda.rav.vehicles.Vehicles;

import java.util.ArrayList;

public class OrdersDao {
    private ArrayList<Order> orders;

    public OrdersDao() {
        orders = new ArrayList<>();
    }
    public void add(Order order){
        if(isAvailable(order.getVehicle(), order.getPeriod())){
            orders.add(order);
        }
    }

    public int size(){
        return orders.size();
    }

    public boolean isAvailable(Vehicles vehicle, Period period){
        if(orders.isEmpty()) return true;
        for (int i = 0; i < orders.size() ; i++) {
            if(orders.get(i).getVehicle().getVin() == vehicle.getVin()){
                // znaleziony pojazd - sprawdzamy czas
                if(orders.get(i).getPeriod().isImposes(period)) return false;
            }
        }
        return true;
    }
}
