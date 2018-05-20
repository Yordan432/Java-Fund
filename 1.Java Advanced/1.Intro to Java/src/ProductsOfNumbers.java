import java.math.BigInteger;
import java.util.Scanner;
public class ProductsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.printf("product[%d..%d] = " , firstNumber , secondNumber);

        BigInteger fact = BigInteger.valueOf(1);
        for (int i = firstNumber; i <=secondNumber ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

    }
}
