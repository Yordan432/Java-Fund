import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class StudentsGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<String> students = new ArrayList<>();
        while (true) {
            if (input[0].equals("END")) {
                break;
            }
            String group = input[2];
            if ("2".equals(group)) {
                students.add(input[0] + " " + input[1]);
            }
            input = reader.readLine().split("\\s+");
        }
        students.stream().sorted((x , y) -> x.split(" ")[0].compareTo(y.split(" ")[0])).forEach(x -> System.out.println(x));
    }

}
