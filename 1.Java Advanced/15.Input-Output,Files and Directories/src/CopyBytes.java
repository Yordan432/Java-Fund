import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\\\input.txt";
        String output = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\output.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream(output);

        int oneByte = inputStream.read();
        while (oneByte >= 0){
            if(oneByte == ' ' || oneByte == '\n'){
                outputStream.write(oneByte);
            }else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i <digits.length(); i++) {
                    outputStream.write(digits.charAt(i));
                }
            }
            oneByte = inputStream.read();
        }

    }
}
