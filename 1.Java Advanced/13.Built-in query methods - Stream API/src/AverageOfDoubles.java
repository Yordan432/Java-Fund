import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.logging.StreamHandler;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> nums = Arrays.asList(bufferedReader.readLine().split("\\s+"));

        OptionalDouble avg =nums.stream().filter(e -> !e.isEmpty()).mapToDouble(Double::valueOf).average();

        if (avg.isPresent()){
            System.out.printf("%.2f" ,avg.getAsDouble());
        }
        else {
            System.out.println("No match");
        }
    }
}