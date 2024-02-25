package Lab3;

import java.util.ArrayList;

public class CandyBag {
    ArrayList<CandyBox> candyBoxes;

    public CandyBag() {
        candyBoxes = new ArrayList<>();
    }

    public void addCandyBox(CandyBox candyBox) {
        candyBoxes.add(candyBox);
    }
}
