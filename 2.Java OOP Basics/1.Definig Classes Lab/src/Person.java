import TestClient.*;
import TestClient.BankAccount;

import java.util.List;
import TestClient.BankAccount.*;
public class Person {
    private String name;
    private Integer age;
    private List<BankAccount> accounts;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }
    public void getBalance(){
        this.accounts.stream().mapToDouble(x -> x.getBalance()).sum();
    }
}
