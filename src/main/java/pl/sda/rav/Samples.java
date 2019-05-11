package pl.sda.rav;

import pl.sda.rav.user.User;
import pl.sda.rav.order.Period;
import pl.sda.rav.user.UserType;
import pl.sda.rav.vehicles.Car;

import java.time.LocalDate;

public class Samples {
    public static Period period_2019_01_20__2019_02_10 = new
            Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
    public static Period period_2019_03_26__2019_04_10 = new
            Period(LocalDate.of(2019,03,26), LocalDate.of(2019, 04,10));
    public static Period period_2018_03_26__2019_02_02 = new
            Period(LocalDate.of(2018,03,26), LocalDate.of(2019, 02,02));

    public static Car car_122 = new Car(122,"Opel", 2010,150,"OPEL");
    public static Car car_123 = new Car(123,"MaŁy fiat", 1988,80,"FIAT");

    public static User user_KLIENT = new User("adamm", "adam", UserType.KLIENT);
    public static User user_ADMIN = new User("romek", "romek", UserType.ADMINITRATOR);


}
