import java.util.ArrayList;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        int[] numbersArray = new int[split.length];

        int indexNumbers = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(split[i]);
        }
        if(numbersArray.length % 2 == 1){
            System.out.println("invalid length");
            return;
        }

        int i = 0;
        while (indexNumbers != numbersArray.length) {
            if (numbersArray[i] % 2 == 0 && numbersArray[i + 1] % 2 == 0) {
                System.out.print(numbersArray[i] + ", " + numbersArray[i + 1] + " -> both are even");
                System.out.println();
            }
            indexNumbers += 2;
            i += 2;
        }
        i = 0;
        indexNumbers = 0;

        while (indexNumbers <numbersArray.length){
            if(numbersArray[i] % 2 == 1 && numbersArray[i + 1] % 2 == 1){
                System.out.printf("%d, %d -> both are odd" , numbersArray[i] ,numbersArray[i + 1]);
                System.out.println();
            }
            i+=2;
            indexNumbers+=2;
        }
        i = 0;
        indexNumbers = 0;

        while (indexNumbers < numbersArray.length){
            if(numbersArray[i] % 2 == 0 && numbersArray[i + 1] % 2 == 1){
                System.out.printf("%d, %d -> different\n" , numbersArray[i] , numbersArray[i + 1]);

            }
            else if(numbersArray[i] % 2 == 1 && numbersArray[i + 1] % 2 == 0 ){
                System.out.printf("%d, %d -> different\n" ,numbersArray[i] , numbersArray[i + 1]);
            }
            indexNumbers+=2;
            i+=2;

        }
    }
}
