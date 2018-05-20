import java.util.Scanner;
public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (text.contains("<upcase>")){
            int indexStart = text.indexOf("<upcase>");
            int indexEnd = text.indexOf("</upcase>");
            String substr = text.substring(indexStart + 8  , indexEnd);
            text = text.replace("<upcase>" + substr + "</upcase>." , substr.toUpperCase());
        }
        System.out.println(text);

//        String input = scanner.nextLine();
//
//        while (input.contains("<upcase>")) {
//            int start = input.indexOf("<upcase>");
//            int end = input.indexOf("</upcase>");
//            String subs = input.substring(start + 8, end);
//            input = input.replace("<upcase>" + subs + "</upcase>", subs.toUpperCase());
//        }
//        System.out.println(input);
    }
}
