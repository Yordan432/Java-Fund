import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.lang.reflect.Array;
import java.util.*;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split("[,\\s+]");
        String input = scanner.nextLine();

        String replce = "";
        String pseudoText = input;

        for (String bannedWord : bannedWords) {
            replce = newString('*' , bannedWord.length());
            pseudoText = pseudoText.replace(bannedWord , replce);
        }
        System.out.println(pseudoText);
    }
    public static String newString(char ch, int p) {
        String str = "";
        for (int i = 0; i < p; i++) {
            str += ch;
        }
        return str;
    }
}
