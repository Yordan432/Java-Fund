import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TakeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.stream(numbers).filter(x -> x >= 10 && x<=20).distinct().limit(2).forEach(x -> System.out.print(x + " "));

    }
}
