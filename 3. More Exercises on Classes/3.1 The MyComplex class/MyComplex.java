public class MyComplex {

  private double real;
  private double imag;

  public MyComplex() {
    real = 0;
    imag = 0;
  }

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag() {
    return imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  @Override
  public String toString() {
    return "(" + real + " + " + imag + "i)";
  }

  public boolean isReal() {
    return real == 0;
  }

  public boolean isImaginary() {
    return imag == 0;
  }

  public boolean equals(double real, double imag) {
    return this.real == real && this.imag == imag;
  }

  public boolean equals(MyComplex another) {
    return this.real == another.real && this.imag == another.imag;
  }

  public double Magnitude() {
    return Math.sqrt(real * real + imag * imag);
  }

  public double argument() {
    return Math.atan2(imag, real);
  }

  public MyComplex addInto(MyComplex right) {
    this.real += right.real;
    this.imag += right.imag;
    return this;
  }

  public MyComplex add(MyComplex right) {
    real += right.real;
    imag += right.imag;
    return this;
  }

  public MyComplex addNew(MyComplex right) {
    return new MyComplex(real + right.real, imag + right.imag);
  }

  public MyComplex subtract(MyComplex right) {
    real -= right.real;
    imag -= right.imag;
    return this;
  }

  public MyComplex subtractNew(MyComplex right) {
    return new MyComplex(real - right.real, imag - right.imag);
  }

  public MyComplex multiply(MyComplex right) {
    real = real * right.real - imag * right.imag;
    imag = real * right.imag + imag * right.real;
    return this;
  }

  public MyComplex divide(MyComplex right) {
    real =
      (real * right.real + imag * right.imag) /
      (right.real * right.real + right.imag * right.imag);
    imag -=
      (imag * right.real - real * right.imag) /
      (right.real * right.real + right.imag * right.imag);
    return this;
  }

  public MyComplex conjugate() {
    imag *= -1;
    return this;
  }
}
