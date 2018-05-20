import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] input = scanner.nextLine().split(" ");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = input[c];
            }
        }
        int dLength = 1;
        int hLength = 1;
        int vLength = 1;
        int bestLength = 0;
        List<String> outputList = new ArrayList<>();
        String symbol = "";

        //check diagonal
        for (int r = 0; r < rows - 1; r++) {
            if (matrix[r][r].equals(matrix[r + 1][r + 1])) {
                dLength++;
                if (dLength > bestLength) {
                    bestLength = dLength;
                    symbol = matrix[r][r];
                }
            }
        }

        //check horizontal
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols - 1; c++) {
                if (matrix[r][c].equals(matrix[r][c + 1])) {
                    hLength++;
                    if (hLength > bestLength) {
                        bestLength = hLength;
                        symbol = matrix[r][c];
                    }
                } else {
                    hLength = 1;
                }
            }
        }

        //check vertical
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows - 1; r++) {
                if (matrix[r][c].equals(matrix[r + 1][c])) {
                    vLength++;
                    if (vLength > bestLength) {
                        bestLength = vLength;
                        symbol = matrix[r][c];
                    }
                } else {
                    vLength = 1;
                }
            }
        }
        for (int i = 0; i < bestLength; i++) {
            outputList.add(symbol);
        }
        String outputListAsAString = String.join(", ", outputList);
        System.out.println(outputListAsAString);

    }

}
