import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackDate = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String type = command[0];
            if (command.length > 1){
                int number = Integer.parseInt(command[1]);
                IsCanPushStackNumber(type , stackDate , number);
            }
            IsCanPopStackNumber(type , stackDate);
            IsPrintMaxElement(type , stackDate);
        }
    }

    private static void IsPrintMaxElement(String type , ArrayDeque<Integer> stackDate) {

        if (type.equals("3")) {
            int max = Integer.MIN_VALUE;
            for (Integer integer : stackDate) {
                if(max < integer){
                    max = integer;
                }
            }
            System.out.println(max);
        }
    }
    private static void IsCanPopStackNumber(String type, ArrayDeque<Integer> stackDate) {
        if (type.equals("2")){
            stackDate.pop();
        }
    }

    private static void IsCanPushStackNumber(String type , ArrayDeque<Integer> stack , int number) {
        if(type.equals("1")){
            stack.push(number);
        }
    }
}
