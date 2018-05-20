import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        int countItemsInQueue = Integer.parseInt(input[0]);
        int countItemsPop = Integer.parseInt(input[1]);
        int findItemInQueue = Integer.parseInt(input[2]);

        String[] numbers = scanner.nextLine().split("\\s+");
        int[] parsedNumber = ParseNumber(numbers);

        CountPushItem(countItemsInQueue , parsedNumber , deque);
        CountPopItem(countItemsPop,deque);
       boolean isContains = ContainsNumber(findItemInQueue , deque);
        if (!isContains){
            NotContainsNumber(deque);
        }

    }

    private static void NotContainsNumber(ArrayDeque<Integer> deque) {
        int max = Integer.MAX_VALUE;

        for (Integer integer : deque) {
            if(max > integer){
                max = integer;
                System.out.println(max);
                break;
            }
        }
        System.out.println(0);
    }
    private static boolean ContainsNumber(int findItemInQueue, ArrayDeque<Integer> deque) {
        for (Integer integer : deque) {
            if(integer == findItemInQueue){
                System.out.println("true");
                return true;
            }
        }
        return false;
    }

    private static void CountPopItem(int countItemsPop , ArrayDeque<Integer> deque) {
        for (int i = 0; i <countItemsPop; i++) {
            deque.poll();
        }
    }

    private static void CountPushItem(int countItemsInQueue, int[] parsedNumber, ArrayDeque<Integer> deque) {
        for (int i : parsedNumber) {
            deque.offer(i);
        }
    }

    private static int[] ParseNumber(String[] numbers) {
        int[] numberParsed = new int[numbers.length];

        for (int i = 0; i <numbers.length; i++) {
            numberParsed[i] = Integer.parseInt(numbers[i]);
        }

        return numberParsed;

    }
}
