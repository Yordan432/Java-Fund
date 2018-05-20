package Roster;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private String positon;
    private String deparment;
    private String email;
    private int age;

    public Employee(String name, double salary, String positon, String deparment, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.positon = positon;
        this.deparment = deparment;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String positon, String deparment) {
        this(name , salary , positon , deparment , "n/a" , -1);
    }

    public Employee(String name, double salary, String positon, String deparment, int age) {
        this(name , salary , positon , deparment ,"n/a" , age);
    }

    public Employee(String name, double salary, String positon, String deparment, String email) {
        this(name, salary, positon, deparment , email , -1);
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }
}
