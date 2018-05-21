import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(", ");
        int[] nums = ParseNumbers(input);
        int[] newArray = new int[n];
        int index = 0;
       Arrays.sort(nums);

        for (int i = 0; i <nums.length; i++) {
            int[] newArrayNumbers = InterateNumber(nums , newArray);
            int missingNumber = FindContainsNumber(index , nums , n , newArrayNumbers);
            System.out.println(missingNumber);
            break;
        }
    }
    private static  int[] InterateNumber(int[] numbers , int[] newArrayNumbers){
        int count = 1;
        int index = 0;
        for (int i = 0; i <numbers.length; i++) {
            newArrayNumbers[index] = count;
            count++;
            index++;
        }
        return newArrayNumbers;
    }
    private static int FindContainsNumber(int index, int[] nums , int n , int[] newArrayNumbers) {
        int count = 0;
        int missingNumber = 0;
        boolean isEqual = false;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <newArrayNumbers.length; j++) {
                j = i;
                if(newArrayNumbers[j] == nums[i]){
                    isEqual = true;
                    break;
                }
                else {
                    isEqual = false;
                    missingNumber = newArrayNumbers[j];
                    break;
                }
            }
            if (!isEqual){
                break;
            }
        }
        return missingNumber;
    }

    private static int[] ParseNumbers(String[] input) {
        int[] numbers = new int[input.length];

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        return numbers;

    }
}
