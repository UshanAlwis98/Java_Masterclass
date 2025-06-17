public class ComplexNumber {
    private double real;
    private double imaginary;

    //Complex Number = Real part + Imaginary part
    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real
    public double getReal() {
        return this.real;
    }

    // Getter for imaginary
    public double getImaginary() {
        return this.imaginary;
    }

    // Add using real and imaginary values
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Add using another ComplexNumber object
    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    // Subtract using real and imaginary values
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtract using another ComplexNumber object
    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
