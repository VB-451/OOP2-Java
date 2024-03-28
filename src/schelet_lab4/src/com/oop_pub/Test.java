package schelet_lab4.src.com.oop_pub;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        // Test PasswordMaker
        PasswordMaker passwordMaker = PasswordMaker.getInstance();
        String password = passwordMaker.getPassword();
        System.out.println("Generated password: " + password);
        System.out.println("Instance count: " + PasswordMaker.getGetInstanceCount());

        // Test MyImmutableArray
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);

        MyImmutableArray immutableArray = new MyImmutableArray(testArray);

        System.out.println("Original array: " + testArray);
        System.out.println("Immutable array: " + immutableArray.getArray());
        // Attempt to modify the array
        testArray.add(4);
        System.out.println("Modified original array: " + testArray);
        System.out.println("Immutable array after modification attempt: " + immutableArray.getArray());


    }
}
