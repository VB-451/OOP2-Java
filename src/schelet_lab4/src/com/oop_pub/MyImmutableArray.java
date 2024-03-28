package schelet_lab4.src.com.oop_pub;
import java.util.ArrayList;
public class MyImmutableArray {
    private final ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> array) {
        this.immutableArray = new ArrayList<>(array); // Copying elements to ensure immutability
    }

    public ArrayList<Integer> getArray() {
        return new ArrayList<>(immutableArray); // Returning a copy to maintain immutability
    }
}
