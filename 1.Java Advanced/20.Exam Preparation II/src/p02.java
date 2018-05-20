import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern p = Pattern.compile("\\d+");
        String input = reader.readLine();
        Matcher digits = p.matcher(input);
        int[] numbers = new int[2];
        while (digits.find()){
            String digit = digits.group();
            numbers[0] = Integer.parseInt(digit);
        }

    }
}
