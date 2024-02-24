package Lab3;

public class Lindt extends CandyBox{
    float length;
    float width;
    float height;

    public Lindt(){}

    public Lindt(float newLength, float newWidth, float newHeight){
        this.length = newLength;
        this.width = newWidth;
        this.height = newHeight;
    }

    @Override
    public float getVolume(){
        return length * width * height;
    }

}
