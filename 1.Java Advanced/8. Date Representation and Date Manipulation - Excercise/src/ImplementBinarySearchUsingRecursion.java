import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ImplementBinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        int findNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers);
        BinarySearch(numbers, findNumber, 0, numbers.length);
    }

    static void BinarySearch(int[] numbersArray, int findNumber, int left, int right) {
        List notNumber = Arrays.asList(numbersArray);

        while (left <= right) {
            int middle = (left + right) / 2;
            if (numbersArray[middle] == findNumber) {
                System.out.println(middle);
                left += 1;
                return;
            } else if (numbersArray[middle] > findNumber) {
                right = middle - 1;
                //BinarySearch(numbersArray, findNumber ,left , right);
            } else if (numbersArray[middle] < findNumber) {
                left = middle + 1;
            }
        }

        if (!notNumber.contains(findNumber)) {
            System.out.println(-1);
            return;
        }
    }
}
