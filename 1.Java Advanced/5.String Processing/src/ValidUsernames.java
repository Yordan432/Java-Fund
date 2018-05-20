import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("END")){
            if(text.length() >= 3 && text.length() <=16){
                System.out.println("valid");
            }
            else {
                System.out.println("invalid");
            }
            text = scanner.nextLine();
        }
    }
}
