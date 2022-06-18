package random;

import java.time.LocalDate;

public class DateRange {
  public DateRange(LocalDate startDate, LocalDate enddate) {
    this.startDate = startDate;
    this.enddate = enddate;
  }

  LocalDate startDate;
  LocalDate enddate;

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEnddate() {
    return enddate;
  }

  public void setEnddate(LocalDate enddate) {
    this.enddate = enddate;
  }
}