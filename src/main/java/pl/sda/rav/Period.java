package pl.sda.rav;

import java.time.LocalDate;

public class Period {
    private LocalDate startDate;
    private LocalDate ebdDate;

    public Period(LocalDate startDate, LocalDate ebdDate) {
        this.startDate = startDate;
        this.ebdDate = ebdDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEbdDate() {
        return ebdDate;
    }

    public void setEbdDate(LocalDate ebdDate) {
        this.ebdDate = ebdDate;
    }
}
