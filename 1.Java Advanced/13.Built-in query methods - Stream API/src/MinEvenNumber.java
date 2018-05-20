import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        List<String> numbers = Arrays.asList(reader.readLine().split("\\s+"));

        OptionalDouble minEven = numbers.stream().
                filter(e -> !e.isEmpty()).
                filter(e -> Double.parseDouble(e) % 2 == 0).mapToDouble(Double::valueOf).min();

        if (minEven.isPresent()){
            System.out.printf("%.2f" ,minEven.getAsDouble());
        }
        else {
            System.out.println("No match");
        }
    }
}
