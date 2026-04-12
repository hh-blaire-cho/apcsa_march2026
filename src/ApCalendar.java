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

  public static int dayOfYear(int month, int day, int year) {
    int[] days = {31, 28, 31, 30, 31, 30,
      31, 31, 30, 31, 30, 31};

    int total = 0;

    for (int i = 0; i < month - 1; i++) {
      total += days[i];
    }

    // 윤년이면 2월 이후 날짜에 +1
    if (isLeapYear(year) && month > 2) {
      total++;
    }

    return total + day;
  }

  public static int firstDayOfYear(int year) {
    int day = 4; // You can use the given information that Jan 1st 1970 was Thursday

    for (int i = 1970; i < year; i++) {
      if (isLeapYear(i)) {
        day = (day + 2) % 7;
      } else {
        day = (day + 1) % 7;
      }
    }
    return day;
  }

  public static int dayOfWeek(int month, int day, int year) {
    int elapsed = dayOfYear(month, day, year);
    int firstDayOfYear = firstDayOfYear(year);
    return (firstDayOfYear + elapsed - 1) % 7;
  }

  public static void main(String[] args) {
    // part a
    System.out.println("Part A");
    System.out.println(ApCalendar.isLeapYear(2020));
    System.out.println(ApCalendar.isLeapYear(2026));
    System.out.println(ApCalendar.isLeapYear(2028));
    System.out.println(ApCalendar.isLeapYear(2100));

    // part b
    System.out.println("Part B");
    System.out.println(ApCalendar.numberOfLeapYears(2020, 2028)); // should be 3. (2020, 2024, 2028)
    System.out.println(ApCalendar.numberOfLeapYears(2099, 2107)); // should be 1. 2100 does not count. Only 2104 count.

    // part c
    System.out.println("Part C");
    System.out.println(ApCalendar.dayOfYear(1, 1, 2026)); // 1
    System.out.println(ApCalendar.dayOfYear(3, 1, 2017)); // 60
    System.out.println(ApCalendar.dayOfYear(3, 1, 2016)); // 61

    // part d
    System.out.println("Part D");
    System.out.println(ApCalendar.firstDayOfYear(2019)); // 2
    System.out.println(ApCalendar.firstDayOfYear(2026)); // 4

    // part e
    System.out.println("Part E");
    System.out.println(ApCalendar.dayOfWeek(1, 5, 2019));  // 2
    System.out.println(ApCalendar.dayOfWeek(1, 10, 2019)); // 4
    System.out.println(ApCalendar.dayOfWeek(4, 4, 2026));  // 6
    System.out.println(ApCalendar.dayOfWeek(4, 5, 2026));  // 0

  }

}
