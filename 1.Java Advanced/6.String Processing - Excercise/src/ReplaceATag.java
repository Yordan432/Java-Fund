import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<String> list = new ArrayList();
        while (input != "END") {
            String url = "<a\\s*?href=\"(.+?)\">(\\w+)<\\/\\w>";
            String replacement = "[URL href=\\\"$1\\\"]$2[/URL]";
            int firstItems = input.indexOf("<a");
            int lastItems = input.indexOf("</a>");
            String subStr = input.substring(firstItems , lastItems);
            String replaces = input.replaceAll(url, replacement);
            System.out.println(replaces);
            input = scanner.nextLine();
        }
    }
}
