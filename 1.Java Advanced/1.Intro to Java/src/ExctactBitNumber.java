import java.util.Scanner;

public class ExctactBitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int p = scanner.nextInt();

        int mask = 1 << p;
        int result = number & mask;
        int bit = result >> p;
        System.out.println(bit);
    }
}
