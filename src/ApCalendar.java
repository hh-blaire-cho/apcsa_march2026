public class ApCalendar {

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0) {
      return true;
    } else {
      return year % 400 == 0;
    }
  }


  public static int numberOfLeapYears(int year1, int year2) {
    int count = 0;
    for (int i = year1; i <= year2; i++) {
      if (isLeapYear(i)) {
        count += 1;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    // part a
    System.out.println(ApCalendar.isLeapYear(2020));
    System.out.println(ApCalendar.isLeapYear(2026));
    System.out.println(ApCalendar.isLeapYear(2028));
    System.out.println(ApCalendar.isLeapYear(2100));

    // part b
    System.out.println(ApCalendar.numberOfLeapYears(2020, 2028)); // should be 3. (2020, 2024, 2028)
    System.out.println(ApCalendar.numberOfLeapYears(2099, 2107)); // should be 1. 2100 does not count. Only 2104 count.

  }

}
