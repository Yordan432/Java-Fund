import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        while (!"END".equals(input[0])){
            int age = Integer.parseInt(input[2]);

            if (age >= 18 && age <= 24){
                print(input);

            }

            input = reader.readLine().split("\\s+");
        }
    }
    private static void print(String[] input) {
        for (String s : input) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
