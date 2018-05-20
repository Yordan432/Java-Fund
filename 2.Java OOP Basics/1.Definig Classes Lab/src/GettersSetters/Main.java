package GettersSetters;
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setId(1);
        bankAccount.setBalance(10);

        System.out.println(bankAccount.getId());
        System.out.println(bankAccount.getBalance());
    }
}
