package classAndObjectsTutorial;

/**
 * Created by igor on 12/16/2017.
 */
public class Customer {
    String firstName;
    String lastName;
    Account acc;
    public void addAccount(double initialBalance) {
        acc = new Account();
        acc.accountId = "ACCT ID = " + Account.nextId++;
        acc.balance = initialBalance;
        System.out.println(acc.accountId + " added");
        System.out.println("Account Added for " + firstName + " " + lastName);
    }
}
