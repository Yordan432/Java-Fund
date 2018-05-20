import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[\\w{3,25}]");

        String regex = "\\w{3,25}";
        System.out.println(input);

    }
}
