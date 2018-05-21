import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> lotCars = new HashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split(", ");
            String inOrOut = tokens[0];
            String carNumber = tokens[1];

            if(inOrOut.equals("IN")){
                lotCars.add(carNumber);
            }
            else if(inOrOut.equals("OUT")){
                lotCars.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if(lotCars.isEmpty()){
            System.out.println("Parking Lot is Empty");
            return;
        }
        for (String lotCar : lotCars) {
            System.out.println(lotCar);
        }
    }
}
