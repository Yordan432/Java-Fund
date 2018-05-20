import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];

        for (int i = 0; i <input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int sum = sum(array , 0);
        System.out.println(sum);
    }
    private static int sum(int[] array , int index) {
        if(index == array.length){
            return 0;
        }
        return array[index] + sum(array , index+1);
    }
}
