import java.io.File;
public class ListFiles {
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL\\Documents\\СофтУни\\Professional Module\\Java Fundamentals\\1.Java Advanced\\15.Input-Output,Files and Directories\\Streams-and-Files";
        File file = new File(path);

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                if(!file1.isDirectory()){
                    System.out.printf("%s: %s%n" , file1.getName() , file1.length());
                }
            }
        }
    }

}
