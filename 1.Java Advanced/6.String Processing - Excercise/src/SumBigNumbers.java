import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        BigInteger num1 = new BigInteger(number1);
        BigInteger num2 = new BigInteger(number2);

        BigInteger sum = num1.add(num2);

        System.out.println(sum);

    }
}
