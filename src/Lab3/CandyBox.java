package Lab3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavour, candyBox.flavour) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
