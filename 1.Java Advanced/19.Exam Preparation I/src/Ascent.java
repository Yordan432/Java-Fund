import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(?<first>[_,])(?<targetMessage>[a-zA-Z]+)(?<digit>[0-9])");
        Map<String, String> map = new LinkedHashMap<>();
        while (true) {
            String input = reader.readLine();
            input = dectyptInputWithOldValue(input, map);
            if ("Ascend".equals(input)) {
                break;
            }
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String match = matcher.group();

                String firstCh = matcher.group("first");
                Integer digit = Integer.valueOf(matcher.group("digit"));
                String message = matcher.group("targetMessage");

                StringBuilder bulder = new StringBuilder();
                if (firstCh.equals("_")) {
                    for (int i = 0; i < message.length(); i++) {
                        bulder.append((char) (message.charAt(i) - digit));
                    }
                } else {
                    for (int i = 0; i < message.length(); i++) {
                        bulder.append((char) (message.charAt(i) + digit));
                    }
                }
                map.put(match, bulder.toString());
                input = input.replace(match , bulder.toString());
            }
            System.out.println(input);
        }
    }
    private static String dectyptInputWithOldValue(String input, Map<String, String> map) {
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            input = input.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        return input;
    }
}
