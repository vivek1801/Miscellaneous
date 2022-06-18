package random;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * For e.g.
 * if startDate is 2020-01-01, I have considered it as 1
 * I/P: continuous date range list= {1,2,3,4,5,6,7,8,9,10},   noncontiguous list   {1,3,4,6}
 * O/P: dateRange: {2,2},{5,5},{7,10}
 *
 */
public class CreateDateRangeForUnCommonElementsOfTwoLists {
  public static void main(String[] args) {
    List<LocalDate> userAvailabilitySortedDateList = getLocalUserDates();
    List<DateRange> continuousDateRangeList = new ArrayList<>();
    final LocalDate startDate = LocalDate.now();
    final LocalDate endDate = startDate.plusDays(10);
    LocalDate tempStartDate = startDate;
    LocalDate nextDate = startDate;
    LocalDate tempEndDate = startDate;
    boolean flag = false;
    int index = 0;
    while (nextDate.compareTo(endDate) <= 0) {
      if (userAvailabilitySortedDateList.size() > index && !userAvailabilitySortedDateList.get(index).isEqual(nextDate)) {
        tempEndDate = nextDate;
        nextDate = nextDate.plusDays(1);
        flag = true;
      } else {
        if (flag) {
          DateRange dateRange = createDateRange(tempStartDate, tempEndDate);
          continuousDateRangeList.add(dateRange);
          flag = false;
        }
        nextDate = nextDate.plusDays(1);
        tempStartDate = nextDate;
        index++;
      }
      if (index == userAvailabilitySortedDateList.size() && nextDate.compareTo(endDate) <= 0) {
        continuousDateRangeList.add(createDateRange(nextDate, endDate));
        break;
      }
    }
    for (DateRange lo : continuousDateRangeList) {
      System.out.println(lo.getStartDate()+"___"+lo.getEnddate());
    }
  }

  private static List<LocalDate> getLocalUserDates() {
    List<LocalDate> userAvailabilitySortedDateList = new ArrayList<>();
    userAvailabilitySortedDateList.add(LocalDate.now().plusDays(1));
    userAvailabilitySortedDateList.add(LocalDate.now().plusDays(3));
    userAvailabilitySortedDateList.add(LocalDate.now().plusDays(4));
    userAvailabilitySortedDateList.add(LocalDate.now().plusDays(6));
    return userAvailabilitySortedDateList;
  }

  static DateRange createDateRange(LocalDate start, LocalDate end) {
    DateRange dateRange = new DateRange(start, end);
    return dateRange;
  }

}
