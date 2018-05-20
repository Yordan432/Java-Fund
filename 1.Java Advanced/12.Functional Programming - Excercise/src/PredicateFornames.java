import java.util.Scanner;

public class PredicateFornames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        for (int i = 0; i <names.length; i++) {
            if(names[i].length() <= n){
                System.out.println(names[i]);
            }
        }
    }
}
