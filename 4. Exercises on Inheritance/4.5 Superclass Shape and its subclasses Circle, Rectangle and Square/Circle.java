import java.lang.Math.*;

public class Circle extends Shape {

  private double radius = 1.0;

  public Circle() {
    super();
    radius = 1.0;
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2 * radius * 2 * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle[" + super.toString() + ",radius=" + radius + ']';
  }
}
