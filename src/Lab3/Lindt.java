package Lab3;

public class Lindt extends CandyBox{
    float length;
    float width;
    float height;

    public Lindt(){}

    public Lindt(String flavour, String origin, float newLength, float newWidth, float newHeight){
        super(flavour, origin);
        this.length = newLength;
        this.width = newWidth;
        this.height = newHeight;
    }

    @Override
    public float getVolume(){
        return length * width * height;
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " Lindt has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.println("Dimensiunile cutiei Lindt: Lungimea = " + length + ", Latimea = " + width + ", Inaltimea = " + height);
    }

}
