import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];

        for (int i = 0; i <input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int findNumber = Integer.parseInt(scanner.nextLine());

        //LinearSearch(array , findNumber , 0);
        Arrays.sort(array);
        BinarySearch(array , 0 , 0 , array.length);
    }
    private static void BinarySearch(int[] array , int index , int left , int right){
       while (left <= right){
           int middle = (left + right) / 2;
           if(array[middle] == index){
               System.out.println(middle);
           }
           else if(array[middle] > index){
               right = middle + 1;
           }
           else if(array[middle] > index){
               left = middle + 1;
           }
           else {
               System.out.println(-1);
               return;
           }
       }
    }

    private static void LinearSearch(int[] array , int findNumber , int index){
        for (int i = 0; i <array.length; i++) {
            if(array[i] >= findNumber){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
