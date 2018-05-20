import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        Function<String , Double> vat = x -> Double.parseDouble(x) * 1.2;

        System.out.println("Prices with VAT:");
        for (int i = 0; i <input.length; i++) {
            String currentNum = vat.apply(input[i]).toString();
            double round = Double.parseDouble(currentNum);
            String endRound = String.format("%.2f" ,round);
            String replace = endRound.replaceAll("\\.", ",");
            System.out.println(replace);
        }






//        double[] numbers = new double[input.length];
//
//        for (int i = 0; i <input.length; i++) {
//            numbers[i] = Double.parseDouble(input[i]);
//        }
//
//        for (double number : numbers) {
//            double res = number * 1.2;
//            System.out.printf("%.2f" , res);
//            System.out.println();
//        }
    }
}
