import java.util.Scanner;
public class PrintNumberFromZeroToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (number < 10){
            System.out.printf("Number: %d" , number);
            System.out.println();
            number++;
        }
    }
}
