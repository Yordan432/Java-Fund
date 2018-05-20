package TestClient;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private int id;
    private double balance;

    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int accountCount;

    public BankAccount() {
        this.id = ++accountCount;
    }
    public void setID(int id) {
        this.id = id;
    }
    public static void setInterestRate(double interestRate){
        interestRate = interestRate;

    }
    public int getId(){
        return this.id;
    }
    public double getInterestRate(int year){
        return this.balance * interestRate * year;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalStateException("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("Account ID%s created", id);
    }
}

