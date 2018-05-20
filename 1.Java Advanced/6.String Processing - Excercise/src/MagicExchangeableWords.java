import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ExchangeableWords(input);
    }
    static void ExchangeableWords(String[] input){
        String firstWord = input[0];
        String secondWord = input[1];
        int counter = 0;
        int largestWords = Math.max(firstWord.length(), secondWord.length());
        boolean[] isExchaneable = new boolean[largestWords];
        Map<Character, Character> words = new HashMap<>();
        if (firstWord.length() == secondWord.length()){
            for (int i = 0; i <largestWords; i++) {
                if(IsExchaneagbleWords(firstWord , secondWord , counter , words)){
                    isExchaneable[i] = true;
                    counter++;
                }
                else {
                    isExchaneable[i] = false;
                }
            }
            for (boolean b : isExchaneable) {
                if(b == false){
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
    private static boolean IsExchaneagbleWords(String firstWord, String secondWord , int counter , Map<Character, Character> words) {
        char[] firstWordChar = firstWord.toCharArray();
        char[] secondWordChar = secondWord.toCharArray();

        if (!words.containsKey(firstWordChar[counter])) {
            words.put(firstWordChar[counter] , secondWordChar[counter]);
            return true;
        }
        else if (words.containsKey(firstWordChar[counter]) && words.containsValue(secondWordChar[counter])){
            return true;
        }
        return false;
    }
}
