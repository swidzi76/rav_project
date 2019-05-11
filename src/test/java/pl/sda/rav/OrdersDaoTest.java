package pl.sda.rav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.order.Order;
import pl.sda.rav.order.OrdersDao;

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
    @Test
    void shouldIsNotAvailableSamePeriod() {
        //given
        OrdersDao ordersDao = new OrdersDao();


        Order order1 = new Order(Samples.user_KLIENT, Samples.car_122, Samples.period_2018_03_26__2019_02_02);
        ordersDao.add(order1);

        //when

        boolean result = ordersDao.isAvailable(Samples.car_122, Samples.period_2018_03_26__2019_02_02);
        //then
        Assertions.assertFalse(result);
    }
    @Test
    void shouldAddSameOrders() {
        //given
        OrdersDao ordersDao = new OrdersDao();


        Order order1 = new Order(Samples.user_KLIENT, Samples.car_122, Samples.period_2018_03_26__2019_02_02);
        Order order2 = new Order(Samples.user_KLIENT, Samples.car_122, Samples.period_2018_03_26__2019_02_02);

        //when
        ordersDao.add(order1);
        ordersDao.add(order2);

        //then

        Assertions.assertEquals(1, ordersDao.size());
    }
}