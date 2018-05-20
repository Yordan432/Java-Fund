import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int counter = 0;
        String findWord = scanner.nextLine().toLowerCase();

        int lastIndex = -1;
        while (true){
            int index = text.indexOf(findWord , lastIndex + 1);
            if (index != -1){
                counter++;
                lastIndex = index;
            }
            else {
                break;
            }
        }
        System.out.println(counter);
    }
}
