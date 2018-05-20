import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> occurrencesCharacter = new TreeMap<>();
        String input = scanner.nextLine();

        int counter = 0;
        char[] toCharArray = input.toCharArray();
        Contains(occurrencesCharacter, toCharArray);
        for (Map.Entry<Character, Integer> characterIntegerEntry : occurrencesCharacter.entrySet()) {
            System.out.printf("%s : %s " , characterIntegerEntry.getKey() , characterIntegerEntry.getValue());
            System.out.println();
        }
    }
    private static void Contains(Map<Character, Integer> occurrencesCharacter, char[] toCharArray) {
        int count = 0;
        for (int i = 0; i < toCharArray.length; i++) {
            if(!occurrencesCharacter.containsKey(toCharArray[i])){
                count++;
                occurrencesCharacter.put(toCharArray[i] , count);
            }
            else if(occurrencesCharacter.containsKey(toCharArray[i])){
                count++;
                occurrencesCharacter.put(toCharArray[i] , count);
            }
            count = 0;
        }

    }
}
