import java.util.Scanner;
public class Gretting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if(first.isEmpty()){
            first = "*****";
        }
        if(second.isEmpty()){
            second = "*****";
        }
        System.out.printf("Hello, %s %s!" , first , second);
    }
}
