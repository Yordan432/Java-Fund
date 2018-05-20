import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<String> names = new ArrayList<>();

        while (!"END".equals(input[0])) {



            input = reader.readLine().split("\\s+");
        }
        names.sort((p1, p2) -> p1.compareTo(p2));

        Collections.reverse(names);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
