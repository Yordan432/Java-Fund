import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicles = scanner.nextLine().split("\\s+");

        String request = scanner.nextLine();
        while (!request.equals("End of customers!")){
            String[] params = request.split("\\s+");
            char vehicle = params[0].toLowerCase().charAt(0);
            int sets = Integer.parseInt(params[2]);

            boolean isContainsVehicle = false;
            for(String item : vehicles){
                char currentVehicle = item.charAt(0);
                int currentSets = item.charAt(1) - '0';
                // will skip to b50 only symbol b and take 50,because take only 5
                if (vehicle == currentVehicle && sets <= currentSets){
                    int price = currentVehicle * currentSets;
                    System.out.println("Yes, sold for " + price + "$");
                    isContainsVehicle = true;
                    break;
                }
            }
            if (!isContainsVehicle){
                System.out.println("No");
            }
            request = scanner.nextLine();
        }
    }
}
