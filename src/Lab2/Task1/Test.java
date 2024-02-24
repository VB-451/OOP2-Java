package Lab2.Task1;

public class Test {
    public static void main(String[] args){
        Complex firstComplex = new Complex(15, 7 );
        Complex secondComplex = new Complex(10, 4);
        firstComplex.addWithComplex(secondComplex);
        firstComplex.showNumber();
        firstComplex.multiplyComplex(secondComplex);
        firstComplex.showNumber();

    }
}
