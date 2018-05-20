import java.util.*;

public class AppliedArithmetic {
    public static List<Integer> date = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int[] numbers = parseListNumbers(input);
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.equals("add")) {
            } else if (command.equals("multiply")) {
                int[] multiplyResult = MultiplyNumbers(numbers);
                List<Integer> dateHasSet = TransferringInHasSet(multiplyResult);
            } else if (command.equals("subtract")) {
                int[] sub = SubtrackNumbers(numbers);
                List<Integer> dateHasSet = TransferringInHasSet(sub);
            } else if (command.equals("print")) {

            }
            command = scanner.nextLine();
        }
    }

    private static int[] SubtrackNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }
        return numbers;
    }

    private static void AddHasSet(int[] dateHasSet, List<Integer> date) {
        for (int i = 0; i < dateHasSet.length; i++) {
            date.add(dateHasSet[i]);
        }
    }

    public static List<Integer> TransferringInHasSet(int[] dateArray) {
        int index = 0;
        int currentNumber = 0;
        for (int i = 0; i < dateArray.length; i++) {
            
        }
        return date;
    }

    private static int[] MultiplyNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    static int[] parseListNumbers(String[] input) {
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        return numbers;
    }
}
