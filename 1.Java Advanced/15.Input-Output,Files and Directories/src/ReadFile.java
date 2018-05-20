import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.System.in;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);

        String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        int oneByte = fileStream.read();
        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fileStream.read();
        }
    }
}
