package Roster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, TreeSet<Employee>> departmentEmployee = new TreeMap<>();
        HashMap<String , Double> departmentSalary = new HashMap<>();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            Double salary = Double.valueOf(input[1]);
            String position = input[2];
            String deparment = input[3];
            Employee employee = null;
            if(input.length == 4){
                employee = new Employee(name , salary , position , deparment);
            }
            else if(input.length == 5){
                if(isNumber(input[4])){
                    int age = Integer.valueOf(input[4]);
                    employee = new Employee(name , salary , position , deparment , age);
                }
                else {
                    String email = input[4];
                    employee = new Employee(name , salary , position , deparment , email);
                }
            }
            else {
                int age = Integer.valueOf(input[5]);
                String email = input[4];
                employee = new Employee(name , salary , position , deparment , email , age);
            }
            if(!departmentEmployee.containsKey(deparment)){
                departmentEmployee.put(deparment , new TreeSet<>());
                departmentSalary.put(deparment , salary);
            }

        }
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
