package classAndObjectsTutorial;

/**
 * Created by igor on 12/16/2017.
 */
public class Bank {
    public static void main(String[] args) {
        Customer howard = new Customer();
        howard.firstName = "Howard";
        howard.lastName = "Test";
        howard.addAccount(500);

        Customer vitali = new Customer();
        vitali.firstName = "Vitali";
        vitali.lastName = "Kusst";
        vitali.addAccount(1000);

    }
}
