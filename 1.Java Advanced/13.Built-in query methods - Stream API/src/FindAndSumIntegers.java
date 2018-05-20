import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        List<String> readNumbers = Arrays.asList(scanner.nextLine().split("\\s+"));

       int sum = SumNumbers(readNumbers);
        if (sum == 0){
            System.out.println("No match");
        }
        else {
            System.out.println(sum);
        }

//        Optional<Integer> sumNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .filter(e -> isNumber(e)).map(Integer::valueOf).reduce((x , y) -> x + y);


    }
    private static int SumNumbers(List<String> readNumbers) {
        int sum = 0;
        for (String readNumber : readNumbers) {
           boolean isNumber = isNumber(readNumber);
            if (isNumber){
                sum+= Integer.parseInt(readNumber);
            }
        }
        return sum;
    }
    private static boolean isNumber(String num){
        boolean isNumber = false;
        int n;
        try {
            n = Integer.parseInt(num);
            isNumber = true;
        }
        catch (Exception ex){

        }
        return isNumber;
    }
}
