import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int rows = numbers[0];
        int cols = numbers[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row <matrix.length; row++) {
            String[] readNumbers = scanner.nextLine().split(", ");
            for (int col = 0; col <matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(readNumbers[col]);
            }
        }
        int startRow = 0;
        int startCol = 0;
        int longestSum = Integer.MIN_VALUE;
        for (int i = 0; i <matrix.length - 1; i++) {
            for (int j = 0; j <matrix[0].length - 1; j++) {
               int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if(longestSum < sum){
                    longestSum = sum;
                    startRow = i;
                    startCol = j;
                }
            }
        }
        System.out.println(matrix[startRow][startCol] + " " + matrix[startRow][startCol + 1]);
        System.out.println(matrix[startRow + 1][startCol] + " " + matrix[startRow + 1][startCol + 1]);
        System.out.println(longestSum);

    }
}
