package carSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            int power = Integer.valueOf(input[1]);
            String efficiency = null;
            int displacement = 0;
            String color = null;
            Engine engine = null;

            try {
                displacement = Integer.parseInt(input[2]);
                efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            } catch (Exception e) {
                try {
                    displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (Exception ex) {
                    efficiency = input[2];
                    engine = new Engine(model, efficiency, power);
                }
            }
            engines.add(engine);
        }

        int m = Integer.parseInt(reader.readLine());
        Map<String, Car> car = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            String engine = input[1];
            if(input.length == 4){
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                Car car1 = new Car(model , engine , weight, color , engines);
                car.put(model , car1);
            }else if(input.length == 2){
                Car car1 = new Car(model , engine , engines);
                car.put(model , car1);
            }
            else if(input.length == 3){
                if(isNumber(input[2])){
                    Car car1 = new Car(model , engine , engines);
                    car.put(model , car1);
                }
                else {
                    Car car1 = new Car(model , engine , input[2] , engines);
                    car.put(model , car1);
                }
            }
        }
        for (Map.Entry<String, Car> stringCarEntry : car.entrySet()) {
            System.out.println(stringCarEntry.getKey() + ":");
            System.out.println("  " + stringCarEntry.getValue().getEngine() + ":");
            for (Engine engine : engines) {
                if (engine.getEngine().equals(stringCarEntry.getValue().getEngine())) {
                    System.out.println("    Power: " + engine.getPower());
                    if (engine.getDisplacement() != 0) {
                        System.out.println("    Displacement: " + engine.getDisplacement());
                        System.out.println("    Efficiency: " + engine.getEfficiency());
                    } else {
                        System.out.println("    Displacement: " + engine.getDisplacementStr());
                        System.out.println("    Efficiency: " + engine.getEfficiency());
                    }
                    if (stringCarEntry.getValue().getWeight() != 0) {
                        System.out.println("  Weight: " + stringCarEntry.getValue()
                                .getWeight());
                        System.out.println("  Color: " + stringCarEntry.getValue().getColor());
                    } else {
                        System.out.println("  Weight: " + stringCarEntry.getValue().getWeightStr());
                        System.out.println("  Color: " + stringCarEntry.getValue().getColor());
                    }
                }
            }

        }
    }

    private static boolean isNumber(String color) {
        try {
            Integer.parseInt(color);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
