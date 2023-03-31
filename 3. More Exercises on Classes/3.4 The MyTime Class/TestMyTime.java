public class TestMyTime {

  public static void main(String[] args) {
    MyTime myTime = new MyTime(12, 3, 3);
    System.out.println(myTime);

    myTime.setTime(5, 0, 0);

    System.out.println(myTime);
    myTime.nextHour();
    System.out.println(myTime);
    myTime.nextMinute();
    System.out.println(myTime);
    myTime.nextSecond();
    System.out.println(myTime);

    myTime.setTime(-1, 0, 0);
    System.out.println(myTime);
  }
}
