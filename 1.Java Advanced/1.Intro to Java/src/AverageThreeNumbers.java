import java.util.Scanner;
public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double threeumber = scanner.nextDouble();

        double totalSum = firstNumber + secondNumber + threeumber;
        double avg = totalSum / 3;

        System.out.printf("%.2f" ,avg);

    }
}
