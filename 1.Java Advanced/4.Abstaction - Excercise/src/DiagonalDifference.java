import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumDiagonalLeft = 0;
        int sumDiagonalRight = 0;

        int[][]matrix = new int[n][n];
        for (int rows = 0; rows <matrix.length; rows++) {
            String[] numbers = scanner.nextLine().split(" ");
            int digits = Integer.parseInt(numbers[rows]);
            sumDiagonalLeft+=digits;
            for (int cols = 0; cols <matrix[0].length; cols++) {
                matrix[rows][cols] = Integer.parseInt(numbers[cols]);

            }
        }
        int lastDigit = 0;
        int lastRow = 0;
        for (int row = 0; row <matrix.length; row++) {
            for (int col = matrix[0].length - 1; col >=0; col--) {
                int lastCol = col;
                lastDigit = matrix[lastRow][lastCol];
                lastCol--;
                lastRow++;
                sumDiagonalRight+=lastDigit;
            }
            break;
        }
        System.out.println(Math.abs(sumDiagonalLeft - sumDiagonalRight));
    }
}
