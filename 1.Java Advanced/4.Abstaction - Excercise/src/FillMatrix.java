import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FillMatrix(scanner);
    }
    static void FillMatrix(Scanner scanner){
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];
        int currentNumber = 1;
        if(pattern.equals("A")){

            for (int cols = 0; cols <matrix[0].length; cols++) {
                for (int rows = 0; rows <matrix.length; rows++) {
                    matrix[rows][cols] = currentNumber;
                    currentNumber++;
                }
            }
        }
        else if(pattern.equals("B")){
            for (int col = 0; col < size; col++)
            {
                if (col % 2 == 0)
                {
                    for (int row = 0; row < size; row++)
                    {
                        matrix[row][col] = currentNumber;
                        currentNumber++;
                    }
                }
                else
                {
                    for (int row = size - 1; row >= 0; row--)
                    {
                        matrix[row][col] = currentNumber;
                        currentNumber++;
                    }
                }
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}