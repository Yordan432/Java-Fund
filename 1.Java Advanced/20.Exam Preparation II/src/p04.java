import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static javax.swing.UIManager.put;

public class p04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Map<String, String>> map = new TreeMap<>();
        String input = reader.readLine();
        Map<String , String> valueMap = new HashMap<>();

        while (!"Season End".equals(input)) {
            String[] items = input.split(" ");

            String firstTeam = items[2];
            String secondteam = items[0];
            String result = items[4];

            if (!map.containsKey(firstTeam)) {
                valueMap.put(secondteam , result);
                map.put(firstTeam , valueMap);
            }
            input = reader.readLine();
        }
        for (Map.Entry<String, Map<String, String>> letterEntry : map.entrySet()) {
            String letter = letterEntry.getKey();

            for (Map.Entry<String, String> nameEntry : letterEntry.getValue().entrySet()) {
                String name = nameEntry.getKey();
                System.out.print(name + "- ");
                System.out.print(letter + "-> ");
                String student = nameEntry.getValue();
                System.out.println(student);
            }
        }
    }
}
