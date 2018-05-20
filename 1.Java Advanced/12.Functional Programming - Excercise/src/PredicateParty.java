import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = bufferedReader.readLine().split("\\s+");
        String[] input = bufferedReader.readLine().split("\\s+");

        while (!input[0].equals("Party!")) {
            switch (input[0]) {
                case "Remove":
                    String endOrStart = input[1];
                    if (endOrStart.equals("StartsWith")) {
                        String withStart = input[2].toUpperCase();
                        List<String> allWithCurrentAlhabetRemove = AllStartWith(withStart, names);
                        System.out.println(String.join(", ", allWithCurrentAlhabetRemove));
                    } else {
                        //AllWithEnd();
                    }
                    break;
                case "Double":
                    break;
            }

            input = bufferedReader.readLine().split("\\s+");
        }
    }

    private static List<String> AllStartWith(String withStart, String[] input) {
        List<String> names = new ArrayList<>();
        char firstAlhabet = withStart.charAt(0);
        for (String s : input) {
            char alhabet = s.charAt(0);
            if (firstAlhabet != alhabet) {
                names.add(s);
            }
        }
        return names;
    }
}
