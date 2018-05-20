import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];
        for (int i = 0; i <input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        // Bubble sort
//        int[] sortArray = BubbleSort(array);
//        for (int i : sortArray) {
//            System.out.print(i + " ");
//        }

        // Selection sort
        int[] selection = SelectionSort(array);
        for (int i : selection) {
            System.out.print(i + " ");
        }
    }
    private static int[] SelectionSort(int[] array){
        for (int i = 0; i <array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j <array.length; j++) {
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int smallElement = array[index];
            array[index] = array[i];
            array[i] = smallElement;
        }
        return array;
    }
    private static int[] BubbleSort(int[] array){
        int index = 0;
        boolean swap = true;
        do {
            swap = false;
            for (int i = 0; i <array.length - 1; i++) {
                if(array[i] > array[index + 1]){
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    swap = true;
                }
                index++;
            }
            index = 0;

        }while (swap);

        return array;
    }
}
