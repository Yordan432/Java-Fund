import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];

        for (int i = 0; i <input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int rows = numbers[0];
        int cols = numbers[1];
        int[][] matrix = new int[rows][cols];

        int sum = 0;
        for (int i = 0; i <matrix.length; i++) {
            String[]readNumbersMatrix = scanner.nextLine().split(", ");
            for (int j = 0; j <matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(readNumbersMatrix[j]);
                sum+=matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}

