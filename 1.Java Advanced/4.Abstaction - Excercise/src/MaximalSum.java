import java.util.Scanner;
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read input
        int[][] matrix = readInput(scanner);
        
        findMaxSumMatrix(matrix);
    }

    private static void findMaxSumMatrix(int[][] matrix) {
        // finds in it the square 3 x 3 that has maximal sum of its elements.

        //walks a matrix
        int maxSum = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int rows = 0; rows <matrix.length - 2; rows++) {
            for (int column = 0; column <matrix[rows].length - 2; column++) {
                int currentItem = matrix[rows][column];
                int neighborItem = matrix[rows][column + 1];
                int nextNeighborItem = matrix[rows][column + 2];

                int currentDownNeighborItem = matrix[rows + 1][column];
                int downNeighborItem = matrix[rows + 1][column + 1];
                int nextDownNeighborItem = matrix[rows + 1][column + 2];

                int lastItem = matrix[rows + 2][column];
                int lastNeighborItem = matrix[rows + 2][column + 1];
                int nextLastNeighborItem = matrix[rows + 2][column + 2];

                int sum = getSum(currentItem, neighborItem, nextNeighborItem, currentDownNeighborItem, downNeighborItem, nextDownNeighborItem, lastItem, lastNeighborItem, nextLastNeighborItem);

                if(maxSum <=sum){
                    maxSum = sum;
                    row = rows;
                    col = column;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        System.out.printf("%s %s %s\n",matrix[row][col], matrix[row][col + 1],matrix[row][col + 2]);
        System.out.printf("%s %s %s\n",matrix[row + 1][col],matrix[row + 1][col + 1], matrix[row + 1][col + 2]);
        System.out.printf("%s %s %s",matrix[row + 2][col], matrix[row + 2][col + 1], matrix[row + 2][col + 2]);
    }

    private static int getSum(int currentItem, int neighborItem, int nextNeighborItem, int currentDownNeighborItem, int downNeighborItem, int nextDownNeighborItem, int lastItem, int lastNeighborItem, int nextLastNeighborItem) {
        return currentItem + neighborItem + nextNeighborItem + currentDownNeighborItem
                             + downNeighborItem + nextDownNeighborItem + lastItem + lastNeighborItem
                             + nextLastNeighborItem;
    }

    private static int[][] readInput(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][]matrix = new int[row][col];

        for (int rows = 0; rows <matrix.length; rows++) {
            String[] numbers = scanner.nextLine().split("\\s+");
            for (int cols = 0; cols <matrix[0].length; cols++) {
                matrix[rows][cols] = Integer.parseInt(numbers[cols]);
            }
        }
        return matrix;
    }
}
