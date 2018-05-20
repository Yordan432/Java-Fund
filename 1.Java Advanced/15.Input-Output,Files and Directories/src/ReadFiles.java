import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\input.txt";
        String outputFile = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\output.txt";

        List<Character> punctuation = new ArrayList<>();
        Collections.addAll(punctuation, '.', ',', '!', '?');

        try (InputStream in = new FileInputStream(inputFile);
             OutputStream output = new FileOutputStream(outputFile))
        {
            int oneByte = in.read();
            while (oneByte >= 0) {
                char symbol = (char)oneByte;
                System.out.println(symbol);
                if (!punctuation.contains((char)symbol)) {
                    output.write(symbol);
                }
                oneByte = in.read();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
