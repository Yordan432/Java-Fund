import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsFirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printFirstBeforeSecondName(reader);
    }
    private static void printFirstBeforeSecondName(BufferedReader reader) throws IOException {
        String[] input = reader.readLine().split("\\s+");
        while (!"END".equals(input[0])) {
            String firstName = input[0];
            String secondName = input[1];

            boolean isFirstNameGreather = checkFirstBeforeLast(firstName, secondName);
            if (isFirstNameGreather){
                print(firstName , secondName);
            }
            input = reader.readLine().split("\\s+");
        }
    }

    private static void print(String firstName, String secondName) {
        System.out.println(firstName + " " + secondName);
    }

    private static boolean checkFirstBeforeLast(String firstName, String secondName) {
        boolean isGreatherFirst = false;
        int compare = firstName.compareTo(secondName);
        if (compare < 0) {
            isGreatherFirst = true;
            return isGreatherFirst;
        }
        return false;
    }
}
