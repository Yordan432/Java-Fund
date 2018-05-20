import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\\\input.txt";
        String output = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\output.txt";

        try(Scanner scanner = new Scanner(new FileInputStream(path));
         PrintWriter printWriter = new PrintWriter(output)) {
            while (scanner.hasNext()){
                if(scanner.hasNextInt()){
                    printWriter.println(scanner.nextInt());
                }
                scanner.next();
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
