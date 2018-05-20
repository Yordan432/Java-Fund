package speedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, HashSet<Car>> cars = new HashMap<>();
        List<Car> car = new ArrayList<>();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            int fuelAmount = Integer.valueOf(input[1]);
            double fuelCostPerOneKm = Double.valueOf(input[2]);
           car.add(new Car(model , fuelAmount , fuelCostPerOneKm));
        }
        String command = reader.readLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            String carModel = tokens[1];
            double amountKm = Double.valueOf(tokens[2]);

            for (Car car1 : car) {
                if(car1.getModel().equals(carModel)){
                    car1.Drive(amountKm);
                }
            }
            command = reader.readLine();
        }
        for (Car car1 : car) {
            System.out.printf("%s %.2f %.0f%n",car1.getModel() , car1.getFuel() , car1.getDistance());
        }
    }
}
