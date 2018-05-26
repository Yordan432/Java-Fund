import java.util.Scanner;
public class MatrixOfPalindromes {
    static String[] alhabets =
            {"a", "b", "c", "d", "e", "f","g", "h", "i", "j", "k", "l" ,"m", "n", "o"
             ,"p" ,"q", "r", "s", "t","u", "v", "w", "x", "y", "z"
            };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String[][] matrix = generatePalidromesMatrix(input);
        printMatrix(matrix);
    }
    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static String[][] generatePalidromesMatrix(String[] input) {
        int row = Integer.parseInt(input[0]);
        int column = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][column];

        int i = 0;
        int midIndex = 0;
        for (int rows = 0; rows <row; rows++) {
            for (int cols = 0; cols <column; cols++) {
                String firstAlhabet = alhabets[i];
                String middleAlhabet = alhabets[midIndex];
                String lastAlhabet = alhabets[i];
                String concat = firstAlhabet.concat(middleAlhabet).concat(lastAlhabet);
                matrix[rows][cols] = concat;
                midIndex++;
            }
            i++;
            midIndex = i;
        }
        return matrix;
    }
}
