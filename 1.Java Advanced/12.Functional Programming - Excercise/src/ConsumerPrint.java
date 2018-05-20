import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> print = el -> System.out.println(el);

        for (String s : input) {
            print.accept(s);
        }

    }
}
