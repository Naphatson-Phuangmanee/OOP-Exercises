import java.util.Scanner;

class MyComplexApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double real, imag;
    System.out.print("Enter complex number 1 (real and imaginary part): ");
    real = sc.nextDouble();
    imag = sc.nextDouble();
    MyComplex c1 = new MyComplex(real, imag);

    System.out.print("Enter complex number 2 (real and imaginary part): ");
    real = sc.nextDouble();
    imag = sc.nextDouble();
    MyComplex c2 = new MyComplex(real, imag);

    System.out.println();
    System.out.printf("Number 1 is: %s\n", c1);
    System.out.printf("%s is ", c1);
    if (!c1.isReal()) {
      System.out.print("NOT ");
    }
    System.out.println("a pure real number");
    System.out.printf("%s is ", c1);
    if (!c1.isImaginary()) {
      System.out.print("NOT ");
    }
    System.out.println("a pure imaginary number");

    System.out.println();
    System.out.printf("Number 2 is: %s\n", c2);
    System.out.printf("%s is ", c2);
    if (!c2.isReal()) {
      System.out.print("NOT ");
    }
    System.out.println("a pure real number");
    System.out.printf("%s is ", c2);
    if (!c2.isImaginary()) {
      System.out.print("NOT ");
    }
    System.out.println("a pure imaginary number");

    System.out.println();
    System.out.printf("%s is ", c1);
    if (!c1.equals(c2)) {
      System.out.print("NOT ");
    }
    System.out.printf("equal to %s\n", c2);
    System.out.printf("%s + %s = %s ", c1, c2, c1.addNew(c2));
  }
}
