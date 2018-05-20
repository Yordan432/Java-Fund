import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBulder = new StringBuilder();
        String text = scanner.nextLine();

        while (!text.equals("END")){
            strBulder.append(text);
            text = scanner.nextLine();
        }
        Pattern pattern = Pattern.compile("<.+?>");
        Matcher matcher = pattern.matcher(strBulder.toString());

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
