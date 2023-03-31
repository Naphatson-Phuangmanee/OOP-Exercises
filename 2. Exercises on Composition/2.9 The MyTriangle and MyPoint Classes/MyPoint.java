import java.lang.Math;
import java.util.Arrays;

public class MyPoint {
  private int x = 0, y = 0;

  public MyPoint() {
    x = 0;
    y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    int[] array = { x, y };
    return array;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(int x, int y) {
    return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
  }

  public double distance(MyPoint another) {
    return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
  }

  public double distance() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}