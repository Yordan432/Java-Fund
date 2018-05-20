import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][]matrix = new int[row][col];

        for (int rows = 0; rows <matrix.length; rows++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int cols = 0; cols <matrix[0].length; cols++) {
                matrix[rows][cols] = Integer.parseInt(numbers[cols]);
            }
        }
        int count = 0;
        int sum = 0;
        int maxSum = 0;
        int rowCount = 0;
        int lastRow = 0;
        for (int rows = 0; rows <matrix.length; rows++) {
            rowCount++;
            for (int cols = 0; cols <matrix[0].length; cols++) {
                if(count == 3){
                    count = 0;
                    break;
                }
                sum+=matrix[rows][cols];
                count++;
            }
            if (rowCount >=3){
                if (maxSum < sum){
                    maxSum = sum;
                    sum = 0;
                }
            }
        }
    }
}
