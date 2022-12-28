import java.util.Scanner;

public class Account {

    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    public Account(String cname, String cid) {
        this.customerName = cname;
        this.customerID = cid;

    }

    public void deposit(int amount) {
        if (amount != 0) {
            this.balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount != 0) {
            this.balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    public void calculateInterest(int years) {
        double interestRate = 0.0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
    }


}
