package pl.sda.rav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrdersDaoTest {

    @Test
    void shouldIsAvailable() {
        //given
        OrdersDao ordersDao = new OrdersDao();


        Order order1 = new Order(Samples.user_KLIENT, Samples.car_122, Samples.period_2018_03_26__2019_02_02);
        ordersDao.add(order1);

        //when

        boolean result = ordersDao.isAvailable(Samples.car_122, Samples.period_2019_01_20__2019_02_10);
        //then
        Assertions.assertFalse(result);
    }
    @Test
    void shouldIsNotAvailable() {
        //given
        OrdersDao ordersDao = new OrdersDao();


        Order order1 = new Order(Samples.user_KLIENT, Samples.car_122, Samples.period_2018_03_26__2019_02_02);
        ordersDao.add(order1);

        //when

        boolean result = ordersDao.isAvailable(Samples.car_122, Samples.period_2019_03_26__2019_04_10);
        //then
        Assertions.assertTrue(result);
    }
}