package Lab3;

public class CandyBox {
    private String flavour;
    private String origin;

    public CandyBox(){}

    public CandyBox(String newFlavour, String newOrigin){
        this.flavour = newFlavour;
        this.origin = newOrigin;
    }

    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
        "flavour: '" + flavour + '\'' +
        ", origin: '" + origin + '\'' +
        "}";
    }
}
