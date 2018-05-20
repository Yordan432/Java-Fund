import java.util.Scanner;
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double num3 = scanner.nextInt();
        double pow = (num1 + num2 + num3) / Math.sqrt(num3);
        double f1 = Math.pow((num1 * num1 + num2 * num2) / (num1 * num1 - num2 * num2) , pow);
        double f2 = Math.pow(((num1 * num1) + (num2 * num2) - (num3 * num3 * num3)), num1 - num2);
        double difference = Math.abs(((num1 + num2 + num3) / 3) - ((f1 + f2) / 2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,difference);
    }
}
