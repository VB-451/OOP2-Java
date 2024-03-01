package schelet_lab4.src.com.oop_pub;

public class PasswordMaker {
    String name;
    static final int MAGIC_NUMBER = 7;
    RandomStringGenerator rsg = new RandomStringGenerator(20, "abcdefghijklmnopqrstuvwxyz");
    String MAGIC_STRING = rsg.next();
    public void PasswordMaker(String name){
        this.name = name;
    }

    public String getPassword(){

    }

}
