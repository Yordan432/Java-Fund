import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackDate = new ArrayDeque<>();

        String[] dateInput = scanner.nextLine().split("\\s+");
        int pushCount = Integer.parseInt(dateInput[0]);
        int popCount = Integer.parseInt(dateInput[1]);
        int findNumber = Integer.parseInt(dateInput[2]);

        String[] numbersArray = scanner.nextLine().split("\\s+");
        PushItemInStack(pushCount , numbersArray , stackDate);
        PopItemInStack(popCount , stackDate);
        boolean isHaveNumberStack = HaveFindNumberInStack(stackDate , findNumber);
        if (!isHaveNumberStack){
           int minElementStack = OtherwiseNotNumberInStack(stackDate);
            System.out.println(minElementStack);
        }
    }
    private static int OtherwiseNotNumberInStack(ArrayDeque<Integer> stackDate) {
        int minElement = 0;
        for (Integer s : stackDate) {
            minElement = FindMinElement(s , stackDate);
            break;
        }
        return minElement;
    }

    private static int FindMinElement(int x, ArrayDeque<Integer> stackDate) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : stackDate) {
            if(min > integer){
                min = integer;
            }
        }

        return min;
    }
    private static boolean HaveFindNumberInStack(ArrayDeque<Integer> stackDate , int findNumber) {
        for (Integer s : stackDate) {
            if(s == findNumber){
                System.out.println("true");
                return true;
            }
        }
        return false;
    }
    private static void PopItemInStack(int popCount, ArrayDeque<Integer> stackDate) {
        for (int i = 0; i <popCount; i++) {
            stackDate.pop();
        }

    }
    static void PushItemInStack(int pushCount , String[] numbersArray , ArrayDeque<Integer> stackDate){
        for (int i = 0; i <pushCount; i++) {
            stackDate.push(Integer.parseInt(numbersArray[i]));
        }
    }
}
