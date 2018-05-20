import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String protocol = url.substring(0 , 5);
        String server = url.substring(5);
        int endServer = server.indexOf("/" , 5);

        String fullServer = server.substring(3 , endServer);
        String resources = server.substring(endServer + 1);


        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + fullServer);
        System.out.println("Resources = " + resources);
    }
}
