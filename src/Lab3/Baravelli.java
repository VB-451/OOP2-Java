package Lab3;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " Baravelli has volume " + getVolume();
    }

    public void printBaravelliDim() {
        System.out.println("Dimensiunile cutiei Baravelli: Raza = " + radius + ", Inaltimea = " + height);
    }
}
