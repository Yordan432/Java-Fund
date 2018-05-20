import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long[][] matrixPascals = new long[n][n];

        for (int line = 0; line < n; line++) {
            int elements = line + 1;

            matrixPascals[line] = new long[elements];
            matrixPascals[line][0] = 1L;
            matrixPascals[line][elements - 1] = 1L;

            if (line > 1) {
                for (int col = 1; col < elements - 1; col++) {
                    matrixPascals[line][col] = matrixPascals[line - 1][col - 1] + matrixPascals[line - 1][col];
                }
            }
        }
        StringBuilder strBulder = new StringBuilder();

        for (int row = 0; row <matrixPascals.length; row++) {
            for (int col = 0; col <matrixPascals[row].length; col++) {
               if(col > 0){
                   strBulder.append(" ");
               }
               strBulder.append(matrixPascals[row][col]);
            }
            strBulder.append(System.lineSeparator());
        }
        System.out.println(strBulder.toString());
    }
}
