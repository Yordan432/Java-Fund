import java.util.Scanner;

public class p3FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();
        double doubleNumber2 = scanner.nextDouble();

        System.out.print("|" + Integer.toHexString(intNumber).toUpperCase() + "        ");//print first number in hexadecimal
        System.out.print("|" + Integer.toBinaryString(Float.floatToRawIntBits((float)doubleNumber)) + "|        ");// print second number in binary
        System.out.printf("| %.2f", doubleNumber);//second number printed with 2 digits after the decimal point, right aligned
        System.out.printf("| %.3f", doubleNumber2);//third number printed with 3 digits after the decimal point, left aligned
    }
}
