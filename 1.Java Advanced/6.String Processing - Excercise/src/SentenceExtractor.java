import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyword = scanner.nextLine();
        String input = scanner.nextLine();

        String regex = "([A-Z][\\w\\W]*?\\bis\\b[\\w\\W]*?[.!?])";

        while(Pattern.matches(regex , input)){
            System.out.println(input);
        }
    }
}
