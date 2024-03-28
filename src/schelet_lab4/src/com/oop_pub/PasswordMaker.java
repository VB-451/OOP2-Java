package schelet_lab4.src.com.oop_pub;
import java.util.Random;

public class PasswordMaker {
    private static String generateMagicString() {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(20, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        return randomStringGenerator.next();
    }
    private static final int MAGIC_NUMBER = 10; // Arbitrary value, can be changed
    private static final String MAGIC_STRING = generateMagicString(); // Random string of at least 20 characters
    private final String name;

    private static PasswordMaker instance = new PasswordMaker();

    private static int getInstanceCount = 0; // Counter for getInstance() method

    private PasswordMaker() {
        this.name = ""; // Default constructor for singleton pattern
    }

    private PasswordMaker(String name) {
        this.name = name;
    }

    public static PasswordMaker getInstance() {
        getInstanceCount++;
        return instance;
    }

    public String getPassword() {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(MAGIC_NUMBER, MAGIC_STRING);
        String randomStr = randomStringGenerator.next();

        int randomInt = new Random().nextInt(101); // Random integer between 0 and 100
        String nameLength = String.valueOf(name.length());

        return randomStr + nameLength + randomInt;
    }



    public static int getGetInstanceCount() {
        return getInstanceCount;
    }

}
