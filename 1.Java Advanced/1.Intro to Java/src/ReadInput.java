import java.util.Scanner;
public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int sumNumbers = firstNumber + secondNumber + thirdNumber;

        scanner.nextLine();
        String lastString = scanner.nextLine();

        System.out.printf("%s %s %s  %s", firstString, secondString, lastString, sumNumbers);
    }
}
