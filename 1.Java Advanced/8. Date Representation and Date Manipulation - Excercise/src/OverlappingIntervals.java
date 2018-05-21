import java.util.*;

public class OverlappingIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer , Integer> overlapIntervals =  new HashMap<>();
        int countIntervals = 0;
        int prevCountIntervals = 0;
        List<Boolean> isOverlap = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split(",");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            int currentCountIntervals = CountIntervals(num1, num2);
            if(currentCountIntervals == prevCountIntervals){
                isOverlap.add(true);
                overlapIntervals.put(num1 , num2);
            }
            prevCountIntervals = currentCountIntervals;
        }
        if(isOverlap.size() + 1 == overlapIntervals.size() + 1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    private static int CountIntervals(int num1, int num2) {
        int count = 0;

        for (int i = num1; i <num2; i++) {
            count++;
        }

        return count;

    }
}
