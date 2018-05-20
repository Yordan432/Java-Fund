import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split("\\s+");
        int[] numbers = new int[input.length];

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        StringBuilder result = SortFirstEven(numbers , stringBuilder);
        System.out.println(result);

    }
    private static StringBuilder SortFirstEven(int[] numbers , StringBuilder sb) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
               // list.add(numbers[i]);
                sb.append(numbers[i] + " ");
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
               // list.add(numbers[i]);
                sb.append(numbers[i] + " ");
            }
        }

       // List<Integer> result = AddAllOddNumbers(numbers, list);
        return sb;
    }

    private static List<Integer> AddAllOddNumbers(int[] numbers, List<Integer> list) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                list.add(numbers[i]);
            }
        }
        return list;
    }
}
