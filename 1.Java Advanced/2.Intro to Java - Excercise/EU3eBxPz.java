
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> playersData = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String playerName = scanner.nextLine();
            int initialScore = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < playerName.length(); j++) {
                if (playerName.charAt(j) % 2 == 0) {
                    initialScore += playerName.charAt(j);
                } else {
                    initialScore -= playerName.charAt(j);
                }
            }

            playersData.put(playerName, initialScore);

        }


        int max = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> kvp : playersData.entrySet()) {
            if (kvp.getValue() > max) {
                max = kvp.getValue();
                result = String.format("The winner is %s - %d points", kvp.getKey(), kvp.getValue());
            }
        }
        System.out.println(result);
    }


}