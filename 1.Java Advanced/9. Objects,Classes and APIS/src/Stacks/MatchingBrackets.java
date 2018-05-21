package Stacks;
import java.util.ArrayDeque;
import java.util.Scanner;
public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String expressions = scanner.nextLine();

        for (int i = 0; i <expressions.length(); i++) {
            char expression = expressions.charAt(i);
            if(expression == '('){
               stack.push(i);
            }
            else if(expression == ')'){
                System.out.println(expressions.substring(stack.pop() , i + 1));
            }
        }
    }
}
