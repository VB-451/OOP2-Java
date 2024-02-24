package Lab2.Task1;

public class Complex {
    private int real;
    private int imaginary;
    public Complex(int realPart, int imaginaryPart){
        real = realPart;
        imaginary = imaginaryPart;
    }
    public Complex(){
        this(0,0);
    }

    public Complex(Complex complex){
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex secondComplex){
        this.real += secondComplex.real;
        this.imaginary += secondComplex.imaginary;
    }

    public void multiplyComplex(Complex secondComplex){

        int realResult = (real * secondComplex.real - imaginary * secondComplex.imaginary);
        int imaginaryResult = (real * secondComplex.imaginary + imaginary * secondComplex.real);
        real = realResult;
        imaginary = imaginaryResult;
    }

    public void showNumber(){
        System.out.println(real + " + " + imaginary + "i");
    }

}

