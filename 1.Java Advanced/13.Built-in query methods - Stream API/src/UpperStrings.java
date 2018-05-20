import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> strings = Arrays.asList(bufferedReader.readLine().split("\\s+"));
        strings.stream().map(s -> s.toUpperCase()).forEach(x -> System.out.print(x + " "));
    }
}
