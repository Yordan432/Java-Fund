package rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        List<Car> modelCars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.valueOf(input[1]);
            int enginePower = Integer.valueOf(input[2]);
            int cargoWeight = Integer.valueOf(input[3]);
            String type = input[4];
            double tire1 = Double.valueOf(input[5]);
            int tireAge1 = Integer.valueOf(input[6]);
            double tire2 = Double.valueOf(input[7]);
            int tireAge2 = Integer.valueOf(input[8]);
            double tire3 = Double.valueOf(input[9]);
            int tireAge3 = Integer.valueOf(input[10]);
            double tire4 = Double.valueOf(input[11]);
            int tireAge4 = Integer.valueOf(input[12]);

            Car car = new Car(model, enginePower,
                    engineSpeed, cargoWeight, type, tire1, tireAge1,
                    tire2, tireAge2, tire3, tireAge3, tire4, tireAge4);
            modelCars.add(car);
        }
        String command = reader.readLine();
        switch (command) {
            case "fragile":
                for (Car modelCar : modelCars) {
                    if (modelCar.getCargoType().equals("fragile")) {
                        if(modelCar.getTire1Pressure() < 1 || modelCar.getTire2Pressure() < 1 || modelCar.getTire3Pressure() < 1 || modelCar.getTire4Pressure() < 1){
                            System.out.println(modelCar.getMode());
                        }
                    }
                }
                break;
            case "flamable":
                for (Car modelCar : modelCars) {
                    if(modelCar.getEnginePower() > 250){
                        System.out.println(modelCar.getMode());
                    }
                }

                break;
        }
    }
}
