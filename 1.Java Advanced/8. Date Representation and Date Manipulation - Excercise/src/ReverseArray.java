import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i <input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int[] reverseArray = reverseArray(numbers);
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
    }
    static int[] reverseArray(int[] numbers){
        int index = 0;
        int[] reverseNumber = new int[numbers.length];
        for(int i = numbers.length - 1; i>= 0; i--){
            reverseNumber[index] = numbers[i];
            index++;
        }

        return  reverseNumber;
    }
}
