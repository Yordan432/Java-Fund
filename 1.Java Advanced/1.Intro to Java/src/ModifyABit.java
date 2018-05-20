import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int binaryRepresent = scanner.nextInt();
        int position = scanner.nextInt();
        int value = scanner.nextInt();

        int mask = 1 << position;
        int result = (binaryRepresent & ~mask) | ((value << position) & mask);
        System.out.println(result);
    }
}
