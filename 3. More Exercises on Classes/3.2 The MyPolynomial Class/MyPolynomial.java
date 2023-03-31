class MyPolynomial {

  private double[] coeffs;

  public MyPolynomial(double... coeffs) {
    this.coeffs = coeffs;
  }

  public double[] getCoeffs() {
    return coeffs;
  }

  public void setCoeffs(double[] coeffs) {
    this.coeffs = coeffs;
  }

  public int getDegree() {
    return coeffs.length - 1;
  }

  @Override
  public String toString() {
    String result = "";

    for (int deg = coeffs.length - 1; deg >= 0; deg--) {
      String p = "";

      if (coeffs[deg] == 0) continue;

      if (deg != coeffs.length - 1) {
        if (coeffs[deg] > 0) p += "+"; else p += "-";
      }
      p += coeffs[deg];

      if (deg >= 2) p += "x^" + deg; else if (deg == 1) p += "x";

      result += p;
    }
    return result;
  }

  public double evaluate(double x) {
    double result = 0;
    int mul = 1;
    for (int deg = 0; deg < coeffs.length; deg++) {
      result += coeffs[deg] * mul;
      mul *= x;
    }

    return result;
  }

  public MyPolynomial add(MyPolynomial right) {
    int size = Math.max(coeffs.length, right.getDegree() + 1);
    double[] ans = new double[size];

    for (int deg = 0; deg < size; deg++) {
      ans[deg] = 0;
      if (deg <= this.getDegree()) ans[deg] += coeffs[deg];
      if (deg <= right.getDegree()) ans[deg] += right.coeffs[deg];
    }

    return new MyPolynomial(ans);
  }

  public MyPolynomial multiply(MyPolynomial right) {
    int size = this.getDegree() + right.getDegree() + 1;
    double[] ans = new double[size];

    for (int deg1 = 0; deg1 < coeffs.length; deg1++) {
      for (int deg2 = 0; deg2 < right.coeffs.length; deg2++) {
        ans[deg1 + deg2] += coeffs[deg1] * right.coeffs[deg2];
      }
    }

    return new MyPolynomial(ans);
  }
}
