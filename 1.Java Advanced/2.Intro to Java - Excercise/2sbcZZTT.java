import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String winner = "";
        int winnerScore = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int score = scanner.nextInt();
            scanner.nextLine();
            int currentScore = score;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) % 2 == 0) {
                    currentScore += name.charAt(j);
                } else {
                    currentScore -= name.charAt(j);
                }
            }
            if (currentScore > winnerScore) {
                winnerScore = currentScore;
                winner = name;
            }
        }
        System.out.printf("The winner is %s - %s points", winner, winnerScore);
    }
}