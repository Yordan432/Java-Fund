import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int[] reverseArray = ReverseNumbers(numbers);

        List<Integer> result = DivideElementOfN(reverseArray , n);
        Print(result);
    }

    private static void Print(List<Integer> result) {
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static List<Integer> DivideElementOfN(int[] reverseArray , int n) {
        List<Integer> elementsForRemove = new ArrayList<>();
        for (int i = 0; i <reverseArray.length; i++) {
            if(reverseArray[i] % n != 0){
                elementsForRemove.add(reverseArray[i]);
            }
        }
        return elementsForRemove;
        //RemoveElements(elementsForRemove , reverseArray);
    }

    private static void RemoveElements(List<Integer> elementsForRemove, int[] reverseArray) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <reverseArray.length; i++) {
            for (int j = 0; j <elementsForRemove.size(); j++) {
                int currentElement = elementsForRemove.get(j);

            }
        }
    }
    private static int[] ReverseNumbers(int[] numbers) {
        int[] reversed = new int[numbers.length];

        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            int last = numbers[i];
            reversed[index] = last;
            index++;
        }
        return reversed;
    }
}
