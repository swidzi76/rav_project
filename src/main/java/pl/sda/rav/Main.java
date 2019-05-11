package pl.sda.rav;

import pl.sda.rav.user.User;
import pl.sda.rav.user.UserType;

public class Main {
    public static void main(String[] args) {
        System.out.println(" TEST");
        User user = new User("Admin","admin", UserType.ADMINITRATOR);
        System.out.println();
}
}
