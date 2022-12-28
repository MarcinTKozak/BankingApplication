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
        System.out.println("After " + years + " years, your balance vill be: " + newBalance);
    }

    public void showMenu() {
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter you option: ");
            char option1 = scan.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                case 'A':
                    System.out.println("================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("================================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scan.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("================================");
                    getPreviousTransaction();
                    System.out.println("================================");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("Enter how many years of accured interest: ");
                    int years = scan.nextInt();
                    calculateInterest(years);
                    break;

                case 'F':
                    System.out.println("================================");
                    break;

                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, E, F");

            }

        } while (option != 'F');
        System.out.println("Thank you for banking with us!");
    }
}
