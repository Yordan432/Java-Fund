
public class GettersAndSetters {
    private int id;
    private double balance;

    public void setID(int id){
        this.id = id;
    }

    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){

        this.balance +=amount;
    }
    public void withdraw(double amount){
        if (amount > this.balance){
            throw new IllegalStateException("Insufficient balance");
        }
        this.balance-=amount;
    }
    @Override
    public String toString() {
        return String.format("Account ID%s, balance %d.2f" , id , balance);
    }
}
