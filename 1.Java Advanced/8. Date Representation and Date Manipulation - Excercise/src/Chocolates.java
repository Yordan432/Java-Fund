import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] countNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[n];

        for (int i = 0; i < countNumbers.length; i++) {
            numbers[i] = Integer.parseInt(countNumbers[i]);
        }

    }
}
