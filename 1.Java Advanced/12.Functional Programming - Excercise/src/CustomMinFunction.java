import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = bufferedReader.readLine().split("\\s+");

        int min = findMin(numbers);
        System.out.println(min);
    }

    private static int findMin(String[] numbers) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <numbers.length; i++) {
            if(min > Integer.parseInt(numbers[i])){
                min = Integer.parseInt(numbers[i]);
            }
        }
        return min;
    }
}
