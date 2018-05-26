import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrix2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][cols];
        // read input
        readInputMatrix(scanner, rows, cols, matrix);

        // move matrix row and col
        int countEqualItems = 0;
        for (int row = 0; row <rows - 1; row++) {
            for (int column = 0; column <cols - 1; column++) {
                String currentItem = matrix[row][column];
                String neighborItem = matrix[row][column + 1];
                String downItem = matrix[row + 1][column];
                String downNeighborItem = matrix[row + 1][column + 1];

                if (currentItem.equals(neighborItem)
                        && currentItem.equals(downItem)
                        && currentItem.equals(downNeighborItem)){
                    countEqualItems++;
                }
            }
        }
        System.out.println(countEqualItems);
    }

    private static void readInputMatrix(Scanner scanner, int rows, int cols, String[][] matrix) {
        for (int r = 0; r < rows; r++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = input[c];
            }
        }
    }

}
