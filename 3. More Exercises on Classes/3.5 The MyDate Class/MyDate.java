public class MyDate {

  public static final String[] MONTHS = {
    "Jan",
    "Feb",
    "Mar",
    "Apr",
    "May",
    "Jun",
    "Jul",
    "Aug",
    "Sep",
    "Oct",
    "Nov",
    "Dec",
  };
  public static final String[] DAYS = {
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  };
  public static final int[] DAYS_IN_MONTHS = {
    31,
    28,
    31,
    30,
    31,
    30,
    31,
    31,
    30,
    31,
    30,
    31,
  };
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day) {
    if (!isValidDate(year, month, day)) {
      throw new IllegalArgumentException("Invalid year, month, or day!");
    }
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public boolean isLeapYear(int year) {
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
  }

  public boolean isValidDate(int year, int month, int day) {
    if (year < 1 || month < 1 || day < 1) return false;
    if (isLeapYear(year) && month == 2 && day > 29) return false;
    if (!isLeapYear(year) && month == 2 && day > 28) return false;
    if (month != 2 && day > DAYS_IN_MONTHS[month - 1]) return false;

    return true;
  }

  public int getDayofWeek(int year, int month, int day) {
    if (month < 3) {
      year--;
      month += 12;
    }

    return (
      (
        day +
        ((8 + (13 * month)) / 5) +
        (year + (year / 4) - (year / 100) + (year / 400))
      ) %
      7
    );
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (year < 1 || year > 9999) {
      throw new IllegalArgumentException("Invalid year!");
    }
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (month < 1 || year > 12) {
      throw new IllegalArgumentException("Invalid month!");
    }
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (day < 1 || day > DAYS_IN_MONTHS[month - 1]) {
      throw new IllegalArgumentException("Invalid day!");
    }
    this.day = day;
  }

  public void setDate(int year, int month, int day) {
    if (!isValidDate(year, month, day)) {
      throw new IllegalArgumentException("Invalid year, month, or day!");
    }

    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String toString() {
    return String.format(
      "%s %2d %s %4d",
      DAYS[getDayofWeek(year, month, day)],
      day,
      MONTHS[month - 1],
      year
    );
  }

  public MyDate nextYear() {
    if (year + 1 > 9999) {
      throw new IllegalArgumentException("Year out of range!");
    }
    year++;
    return this;
  }

  public MyDate nextMonth() {
    if (month + 1 > 12) {
      nextYear();
      month = 1;
    } else {
      month++;
    }
    return this;
  }

  public MyDate nextDay() {
    int dayInMonths = DAYS_IN_MONTHS[month - 1];
    if (month == 2 && isLeapYear(year)) {
      dayInMonths = 29;
    }

    if (day + 1 > dayInMonths) {
      nextMonth();
      day = 1;
    } else {
      day++;
    }

    return this;
  }

  public MyDate previousYear() {
    if (year - 1 < 1) {
      throw new IllegalArgumentException("Year out of range!");
    }
    year--;
    return this;
  }

  public MyDate previousMonth() {
    if (month - 1 < 1) {
      previousYear();
      month = 12;
    } else {
      month--;
    }
    if (day > DAYS_IN_MONTHS[month - 1]) day = DAYS_IN_MONTHS[month - 1];
    return this;
  }

  public MyDate previousDay() {
    if (day - 1 < 1) {
      previousMonth();
      day = isLeapYear(year) && month == 2 ? 29 : DAYS_IN_MONTHS[month - 1];
    } else {
      day--;
    }
    return this;
  }
}
