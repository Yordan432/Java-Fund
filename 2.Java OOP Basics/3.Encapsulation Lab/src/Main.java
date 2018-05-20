import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        Team team = new Team("Minior");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.valueOf(input[2]);
            try {
                team.addPlayer(new Person(firstName, lastName, age));
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("First team have %s players%n" ,team.getFirstTeam().size());
        System.out.printf("Reserve team have %s players" , team.getLastTeam().size());
    }
}
