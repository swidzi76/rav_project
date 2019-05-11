package pl.sda.rav;


public class Order {
    static int number = 0;
    private int id;
    private User customer;
    private vehicles vehicle;
    private Period period;

    public Order(User customer, vehicles vehicle, Period period) {
        this.id = number++;
        this.customer = customer;
        this.vehicle = vehicle;

        this.period = period;
    }

    public int getId() {
        return id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
