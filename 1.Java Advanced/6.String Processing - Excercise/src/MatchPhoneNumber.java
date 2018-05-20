import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359( |-)2\\1\\d{3}\\1\\d{4}\\b";
        String input = scanner.nextLine();

        while (!input.equals("end")){
            if(Pattern.matches(regex , input)){
                System.out.println(input);
            }

            input = scanner.nextLine();
        }

    }
}
