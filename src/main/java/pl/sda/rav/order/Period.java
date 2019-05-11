package pl.sda.rav.order;

import java.time.LocalDate;

public class Period {
    private LocalDate startDate;
    private LocalDate endDate;

    public Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public boolean isImposes(Period newPeriod){
        if(newPeriod.endDate.isBefore(this.startDate) || this.endDate.isBefore(newPeriod.startDate)){
            return false;
        }else {
            return true;
        }
    }
}
