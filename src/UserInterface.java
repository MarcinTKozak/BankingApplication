import java.util.Scanner;

public class UserInterface {

    private Account name;

    public UserInterface(Account name) {
        this.name = name;
    }

    public void showMenu() {
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, " + name.customerName + "!");
        System.out.println("Your ID is: " + name.customerID);
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
                    System.out.println("Balance = $" + name.balance);
                    System.out.println("================================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scan.nextInt();
                    name.deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scan.nextInt();
                    name.withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("================================");
                    name.getPreviousTransaction();
                    System.out.println("================================");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("Enter how many years of accured interest: ");
                    int years = scan.nextInt();
                    name.calculateInterest(years);
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
