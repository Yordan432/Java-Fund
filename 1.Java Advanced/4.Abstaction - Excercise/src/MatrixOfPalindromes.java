import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        char[] alhabets = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' ,'q', 'r', 's' ,
                't' , 'u', 'v' , 'x' , 'y' , 'w' , 'z'};
        char[][] matrix = new char[row][col];

        // TODO
        

    }
}
