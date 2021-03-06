package pl.sda.rav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.order.Period;

import java.time.LocalDate;

class PeriodTest {

    @Test
    void shouldStartBetwinStartAndEnd() {
        //given
        Period period1 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
        Period period2 = new Period(LocalDate.of(2019,01,26), LocalDate.of(2019, 03,10));

        //when

        boolean result = period1.isImposes(period2);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldEndBetwinStartAndEnd() {
        //given
        Period period1 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
        Period period2 = new Period(LocalDate.of(2018,12,26), LocalDate.of(2019, 02,8));

        //when

        boolean result = period1.isImposes(period2);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldStartAndEndBetwinStartAndEnd() {
        //given
        Period period1 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
        Period period2 = new Period(LocalDate.of(2019,01,26), LocalDate.of(2019, 02,8));

        //when

        boolean result = period1.isImposes(period2);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldNotImposes() {
        //given
        Period period1 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
        Period period2 = new Period(LocalDate.of(2019,03,26), LocalDate.of(2019, 04,8));

        //when

        boolean result = period1.isImposes(period2);
        //then
        Assertions.assertFalse(result);
    }
    @Test
    void shouldSamePeriod() {
        //given
        Period period1 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));
        Period period2 = new Period(LocalDate.of(2019,01,20), LocalDate.of(2019, 02,10));

        //when

        boolean result = period1.isImposes(period2);
        //then
        Assertions.assertTrue(result);
    }
}