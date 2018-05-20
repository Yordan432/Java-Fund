import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args){
       final String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\\\input.txt";
       final String output = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\output.txt";

        Path path1 = Paths.get(path);
        Path pathOut = Paths.get(output);
        try {
            List<String> list = Files.readAllLines(path1);
            Collections.sort(list);
            Files.write(pathOut , list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
