public class BankAccount {
    
    private int accountID;
    private String name;
    private double balance;
    private static int nextID = 100000;

    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
        this.accountID = ++nextID;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountID = ++nextID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void print() {
        System.out.println("******************");
        System.out.println("Name: " + this.name);
        System.out.println("Balance " + this.balance);
        System.out.println("Account ID: " + this.accountID);
        System.out.println("******************");
    }
}