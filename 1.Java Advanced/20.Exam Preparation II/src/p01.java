import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        IsBeginWithNumber(input);
        Multiplied(input);
    }

    private static void Multiplied(String[] input) {

    }

    private static void IsBeginWithNumber(String[] s) {
        List<Integer> nums = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            char firstSymbol = s[count].charAt(0);
            if (Character.isDigit(firstSymbol)) {
                nums.add((int) firstSymbol - '0');
                count++;
            }
        }
        int sum = FindSum(nums);
        System.out.println(sum);
    }

    private static int FindSum(List<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }
}
