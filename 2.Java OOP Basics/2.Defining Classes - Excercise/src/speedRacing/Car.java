package speedRacing;

import java.util.HashSet;

public class Car {
    static final int _DEFAULT_DISTANCE_TRAVEL = 0;
    private String model;
    private double fuel;
    private double amount;
    private double distanceTravel;

    public Car() {
    }

    public Car(String model, double fuel, double amount) {
        this.model = model;
        this.fuel = fuel;
        this.amount = amount;
        this.distanceTravel = _DEFAULT_DISTANCE_TRAVEL;
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }
    public double getDistance(){
        return this.distanceTravel;
    }
    public void Drive(double distance){
        if(distance * amount <=fuel){
            distanceTravel+=distance;
            fuel -=distance* amount;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }
}
