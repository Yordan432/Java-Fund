import java.util.Scanner;
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        int[] numbersArray = new int[split.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(split[i]);
        }

        String commandGet = scanner.nextLine();
        String[] text = commandGet.split("\\s+");

        int number = Integer.parseInt(text[1]);
        String oddEven = text[2];

        if(oddEven.equals("odd")){
            for (int i = 0; i <numbersArray.length; i++) {
                if(Math.abs(numbersArray[i] % 2) == 1){
                    System.out.print(numbersArray[i] + " ");
                    number--;
                }
                if(number == 0){
                    return;
                }
            }
        }
        else if(oddEven.equals("even")){
            for (int i = 0; i < numbersArray.length; i++) {
                if(Math.abs(numbersArray[i] % 2) == 0){
                    System.out.print(numbersArray[i] + " ");
                    number--;
                }
                if(number == 0){
                    return;
                }
            }
        }
        System.out.println();
    }
}
