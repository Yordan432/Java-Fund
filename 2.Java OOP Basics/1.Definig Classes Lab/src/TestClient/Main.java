package TestClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        while (!"End".equals(input[0])) {
            String command = input[0];
            switch (command) {
                case "Create":
                    BankAccount bankAccount1 = new BankAccount();
                    accounts.put(bankAccount1.getId() , bankAccount1);
                    System.out.println(bankAccount1);
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(input[1]));
                    break;
                case "GetInterest":
                    int id = Integer.valueOf(input[1]);
                    double amount = Double.valueOf(input[2]);
                    //System.out.printf("%s " , accounts.get(id).deposit(amount));
//                    System.out.println(getInterestRate(Integer.valueOf(input[2])));
                    System.out.printf("%.2f" , accounts.get(Integer.valueOf(input[2])));
                    break;
                case "Deposit":
                    int idD = Integer.valueOf(input[1]);
                    if(!accounts.containsKey(idD)){
                        System.out.println("Account does not exist");
                    }else {
                        double amountD = Double.valueOf(input[2]);
                        accounts.get(idD).deposit(amountD);
//                    addDepositInBankAccount(accounts , input);
                    }
                   break;
//                case "Withdraw":
//                    withdraw(accounts , input);
//                    break;
//                case "Print":
//                print(accounts , input);
//                    break;
            }
            input = reader.readLine().split("\\s+");
        }
    }

    private static void print(HashMap<Integer, BankAccount> accounts, String[] input) {
        int id = Integer.parseInt(input[1]);
        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            BankAccount account = accounts.get(id);
            System.out.printf("Account ID%s, balance %.2f%n", id, account.getBalance());
        }
    }

    private static void addDepositInBankAccount(HashMap<Integer, BankAccount> accounts, String[] input) {
        Integer id = Integer.parseInt(input[1]);
        double amount = Double.parseDouble(input[2]);
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
        } else {
            System.out.println("Account does not exist");
        }

    }

    private static void withdraw(HashMap<Integer, BankAccount> accounts, String[] input) {
        Integer id = Integer.parseInt(input[1]);
        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }
        double amount = Double.parseDouble(input[2]);
        try {
            accounts.get(id).withdraw(amount);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createIdAccount(int id, HashMap<Integer, BankAccount> accounts) {
        BankAccount bankAccount = new BankAccount();
        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            bankAccount.setID(id);
            accounts.put(id, bankAccount);
        }

    }
}
