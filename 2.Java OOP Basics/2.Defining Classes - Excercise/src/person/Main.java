package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        TreeMap<String , Person> treeMapPersons = new TreeMap<>();
        for (int i = 0; i <n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            if(age > 30){
                Person person = new Person(name , age);
                treeMapPersons.put(name , person);
            }
        }
        for (String s : treeMapPersons.keySet()) {
            String name = treeMapPersons.get(s).getName();
            int age = treeMapPersons.get(s).getAge();
            System.out.printf("%s - %s" , name , age);
        }
        //TreeMapPersonPoll();
        //PollTreeSet();
    }
    private static void TreeMapPersonPoll() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Map<String , Person> mapPerson = new TreeMap<>();
        for (int i = 0; i <n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            if(age > 30){
                Person person = new Person(name , age);
                mapPerson.put(name , person);
            }
        }
        for (String s : mapPerson.keySet()) {
            System.out.printf("%s - %s%n" , mapPerson.get(s).getName() , mapPerson.get(s).getAge());
        }
    }

    private static void PollTreeSet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        TreeSet<Person> personTreeSet = new TreeSet<>();

        for (int i = 0; i <n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            Person person = new Person(name , age);
            personTreeSet.add(person);
        }
        personTreeSet.stream().filter(x->x.getAge()>30)
                .forEach(p-> System.out.printf("%s - %d%n", p.getName(), p.getAge()));
    }
}
