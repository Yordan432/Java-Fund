import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Predicate<String> isUpperWord = el -> el.charAt(0) == String.valueOf(el.charAt(0)).toUpperCase().toCharArray()[0];
        ArrayList<String> letterUpper = new ArrayList<>();

        for (int i = 0; i <input.length; i++) {
            if(isUpperWord.test(input[i])){
                letterUpper.add(input[i]);
            }
        }
        System.out.println(letterUpper.size());
        for (String s : letterUpper) {
            System.out.println(s);
        }
    }
}
