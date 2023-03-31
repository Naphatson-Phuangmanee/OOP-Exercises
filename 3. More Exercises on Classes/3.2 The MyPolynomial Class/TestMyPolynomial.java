class TestMyPolynomial {

  public static void main(String[] args) {
    MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
    MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
    // Can also invoke with an array
    double[] coeffs = { 1.2, 3.4, 5.6, 7.8 };
    MyPolynomial p3 = new MyPolynomial(coeffs);

    System.out.println("polynomial 1 is: " + p1);
    System.out.println("polynomial 2 is: " + p2);
    System.out.println("polynomial 3 is: " + p3);

    System.out.println();
    System.out.println("evaluate of polynomial 1 is " + p1.evaluate(5));

    System.out.println();
    System.out.println(p2 + " + " + p3 + " = " + p2.add(p3));
    System.out.println(p1 + " x " + p3 + " = " + p1.multiply(p3));
  }
}
