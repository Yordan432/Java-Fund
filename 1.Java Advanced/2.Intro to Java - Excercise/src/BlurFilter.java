import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        String[] datePerMatrix = scanner.nextLine().split(" ");
        int row = Integer.parseInt(datePerMatrix[0]);
        int col = Integer.parseInt(datePerMatrix[1]);

        long[][] matrix = new long[row][col];
        for (int rows = 0; rows <row; rows++) {
            String[] nums = scanner.nextLine().split(" ");
            for (int cols = 0; cols <col; cols++) {
                matrix[rows][cols] = Integer.parseInt(nums[cols]);
            }
        }
        String[] target = scanner.nextLine().split(" ");
        int rowTarget = Integer.parseInt(target[0]);
        int colTarget = Integer.parseInt(target[1]);

        int startRow = Math.max(0 , rowTarget - 1);
        int endRow = Math.min(row - 1 , rowTarget + 1);

        int startCol = Math.max(0 , colTarget - 1);
        int endCol = Math.min(col - 1 , colTarget + 1);

        for (int rows = startRow; rows <=endRow; rows++) {
            for (int cols = startCol; cols <=endCol; cols++) {
                matrix[rows][cols] +=amount;
            }
        }
        for (int rows = 0; rows <row; rows++) {
            for (int cols = 0; cols <col; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
