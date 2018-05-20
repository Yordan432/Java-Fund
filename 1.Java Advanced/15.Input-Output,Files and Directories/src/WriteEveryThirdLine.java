import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\\\input.txt";
        String output = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(path));
             PrintWriter out = new PrintWriter(new FileWriter(output))) {
            int count = 1;
            String line = in.readLine();
            while (line != null){
                if(count % 3 == 0){
                    out.println(line);
                }
                count++;
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
