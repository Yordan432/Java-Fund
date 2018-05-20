import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> nameAge = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputDate = scanner.nextLine().split(", ");
            String name = inputDate[0];
            int age = Integer.parseInt(inputDate[1]);

            nameAge.put(name, age);
        }
        String conditionInput = scanner.nextLine();
        Integer ageInput = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> tester = condition(conditionInput, ageInput);
        Consumer<Map.Entry<String, Integer>> print = printer(format);

        PrintResult(nameAge, tester, print);

    }

    private static Predicate<Integer> condition(String cond, int age) {
        switch (cond) {
            case "older":
                return x -> x >= age;
            case "younger":
                return x -> x < age;
            default:
                return null;
        }
    }

    private static Consumer<Map.Entry<String, Integer>> printer(String format) {
        switch (format) {
            case "name":
                return p -> System.out.printf("%s%n", p.getKey());
            case "age":
                return p -> System.out.printf("%d", p.getValue());
            case "name age":
                return p -> System.out.printf("%s - %d%n", p.getKey(), p.getValue());
            default:
                return null;
        }
    }

    private static void PrintResult(HashMap<String, Integer> students, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> p : students.entrySet()) {
            if (tester.test(students.get(p.getKey()))) {
                printer.accept(p);
            }
        }
    }
}
