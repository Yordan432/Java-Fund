import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<String> list = new ArrayList();
        while (input != "END"){
            String url = "<a\\s*?href=\"(.+?)\">(\\w+)<\\/\\w>";
            String replacement = "[URL href=\\\"$1\\\"]$2[/URL]";
            input = input.replaceAll(url , replacement);

            input = scanner.nextLine();
        }
    }
}
