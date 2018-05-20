package rawData;

public class Car {
    private String mode;
    private int enginePower;
    private int engineSpeed;
    private int cargoWeight;
    private String cargoType;
    private double tire1Pressure;
    private int tireAge1;
    private double tire2Pressure;
    private int tireAge2;
    private double tire3Pressure;
    private int tireAge3;
    private double tire4Pressure;
    private int tireAge4;

    public Car(String mode, int enginePower, int engineSpeed, int cargoWeight, String cargoType, double tire1Pressure, int tireAge1, double tire2Pressure, int tireAge2, double tire3Pressure, int tireAge3, double tire4Pressure, int tireAge4) {
        this.mode = mode;
        this.enginePower = enginePower;
        this.engineSpeed = engineSpeed;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tire1Pressure = tire1Pressure;
        this.tireAge1 = tireAge1;
        this.tire2Pressure = tire2Pressure;
        this.tireAge2 = tireAge2;
        this.tire3Pressure = tire3Pressure;
        this.tireAge3 = tireAge3;
        this.tire4Pressure = tire4Pressure;
        this.tireAge4 = tireAge4;
    }

    public String getCargoType() {
        return this.cargoType;
    }

    public int getCargoWeight() {
        return this.cargoWeight;
    }
    public String getMode() {
        return this.mode;
    }

    public double getTire1Pressure() {
        return this.tire1Pressure;
    }

    public double getTire2Pressure() {
        return this.tire2Pressure;
    }

    public double getTire3Pressure() {
        return this.tire3Pressure;
    }

    public int getEnginePower() {
        return this.enginePower;
    }

    public double getTire4Pressure() {
        return this.tire4Pressure;
    }
}
