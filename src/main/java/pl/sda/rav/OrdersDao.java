package pl.sda.rav;

import java.util.ArrayList;

public class OrdersDao {
    private ArrayList<Order> orders;

    public OrdersDao() {
        orders = new ArrayList<>();
    }
    public void add(Order order){
        orders.add(order);
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
