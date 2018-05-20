import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isEndParentheses = false;
        boolean[] parentheses = new boolean[input.length() / 2];

        char[] inputChar = input.toCharArray();
        for (int i = 0; i < inputChar.length / 2; i++) {
            stack.push(inputChar[i]);
            isEndParentheses = FindEndParentheses(stack, inputChar, isEndParentheses);
            if (isEndParentheses) {
                parentheses[i] = true;
            } else {
                parentheses[i] = false;
            }
            stack.poll();
        }
        boolean isAllTrueParentheses = IsAllTrueParentheses(parentheses);
        if (isAllTrueParentheses) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    private static boolean IsAllTrueParentheses(boolean[] parentheses) {
        boolean isTrue = false;
        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i] == true) {
                isTrue = true;
            } else {
                isTrue = false;
            }
        }

        return isTrue;
    }
    private static boolean FindEndParentheses(ArrayDeque<Character> stack, char[] inputChar, boolean isEndParentheses) {
        String currentElementStack = String.valueOf(stack.poll());

        if (currentElementStack.equals("{")) {
            for (int i = 0; i < inputChar.length; i++) {
                if (inputChar[i] == '}') {
                    return true;
                }
            }
        } else if (currentElementStack.equals("[")) {
            for (int i = 0; i < inputChar.length; i++) {
                if (inputChar[i] == ']') {
                    return true;
                }
            }
        } else if (currentElementStack.equals("(")) {
            for (int i = 0; i < inputChar.length; i++) {
                if (inputChar[i] == ')') {
                    return true;
                }
            }
        }
        return false;
    }
}
