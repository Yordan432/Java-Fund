import java.util.ArrayList;
import java.util.Scanner;
public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <input.length; i++) {
           int currentNumber = Integer.parseInt(input[i]);
            numbers.add(currentNumber);
        }
        numbers.removeIf(n -> n % 2 != 0);
        int lastRow = 0;
        for (Integer number : numbers) {
            if(lastRow != numbers.size() - 1){
                System.out.print(number + ", ");
            }
            else {
                System.out.println(number);
            }
            lastRow++;
        }
        lastRow = 0;
        numbers.sort((a , b) -> a.compareTo(b));
        for (Integer number : numbers) {
            if(lastRow != numbers.size() - 1){
                System.out.print(number + ", ");
            }
            else {
                System.out.println(number);
            }
            lastRow++;
        }

    }
}
