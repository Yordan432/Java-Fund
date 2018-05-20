import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (int i = 0; i <input.length; i++) {
            FindSum(input[i]);
        }


    }

    private static void FindSum(String s) {
        char firstLetter = s.toCharArray()[0];
        char lastLetter = s.toCharArray()[s.length() - 1];
        int indexFirstLetter = s.indexOf(firstLetter);
        int indexLastLetter = s.indexOf(lastLetter);
        String removeFirstLetter = s.substring(indexFirstLetter , 1);
        String removeLastLetter = s.substring(indexLastLetter);
        s =  s.replace(removeFirstLetter , "").trim();
        s = s.replace(removeLastLetter , "").trim();

        String pseudoText = s;
        double sum = 0;
        for (int i = 1; i <=s.length(); i++) {
            int parseNumber = Integer.parseInt(s);
            if(Character.isUpperCase(firstLetter) || Character.isUpperCase(lastLetter)){
                sum = parseNumber / i;
                firstLetter = lastLetter;
                continue;
            }
            if(Character.isLowerCase(lastLetter) || Character.isLowerCase(firstLetter)){
                sum +=i;
            }
        }


    }
}
