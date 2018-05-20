import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        FindFirstBrackets(input , stack);

    }

    private static void FindFirstBrackets(String input, ArrayDeque<String> stack) {
        char[] toCharArray = input.toCharArray();
        for (int i = 0; i <toCharArray.length; i++) {

        }
    }
}
