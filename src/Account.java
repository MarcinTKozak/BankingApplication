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
        //8:40 sec 
    }
}
