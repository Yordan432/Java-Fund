import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int lowerNum = Integer.parseInt(input[0]);
        int upperNum = Integer.parseInt(input[1]);
        String command = scanner.nextLine();
        if (command.equals("odd")){
           ArrayList<Integer> result = RangeNumberOdd(lowerNum , upperNum);
           Print(result);
        }
        else {
           ArrayList<Integer> result = RangeNumberEven(lowerNum , upperNum);
            Print(result);
        }

    }
    private static ArrayList<Integer> RangeNumberEven(int lowerNum, int upperNum) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerNum; i <=upperNum; i++) {
            numbers.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            Predicate<Integer> evenNumbers = x -> x % 2 == 0;
            if(evenNumbers.test(number)){
                result.add(number);
            }
        }
        return result;
    }

    private static void Print(ArrayList<Integer> result) {
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> RangeNumberOdd(int lowerNum, int upperNum) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerNum; i <=upperNum; i++) {
            numbers.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            Predicate<Integer> oddNumbers = x -> x % 2 != 0;
            if(oddNumbers.test(number)){
                result.add(number);
            }
        }
        return result;
    }
}
