import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];

        List<Character> vowel = new ArrayList<>();
        Collections.addAll(vowel , 'a' , 'o'  , 'e' , 'i' , 'u' , 'A' , 'O' , 'E' , 'I' , 'U');;

        int sum = 0;
        for (int i = 0; i <n; i++) {
            String name = scanner.nextLine();
            names[i] = name;
        }
        int[] result = new int[n];
        for (int i = 0; i <names.length; i++) {
            String currentName = names[i];

            char[] toCharArray = currentName.toCharArray();
            for (int j = 0; j <toCharArray.length; j++) {
                if(vowel.contains(toCharArray[j])){
                    sum+=(int)toCharArray[j] * toCharArray.length;
                }
                else {
                    sum+=(int)toCharArray[j] / toCharArray.length;
                }
            }
            result[i] = sum;
            sum = 0;
        }
        Arrays.sort(result);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
