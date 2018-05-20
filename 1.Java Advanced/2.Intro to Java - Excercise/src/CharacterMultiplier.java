import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        findSumCharacter(input);
    }
    private static void findSumCharacter(String input) {
        String firstString = input.split("\\s+")[0];
        String secondString = input.split("\\s+")[1];

        int minLength = Math.min(firstString.length(), secondString.length());
        int totalSum = 0;
        for (int i = 0; i <minLength; i++) {
            //give each symbol
            char firstSymbol = firstString.charAt(i);
            char secondSymbol = secondString.charAt(i);
            totalSum +=(int)firstSymbol * (int) secondSymbol;
        }
        System.out.println(totalSum);
    }
}
