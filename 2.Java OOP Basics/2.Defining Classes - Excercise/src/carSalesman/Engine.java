package carSalesman;

public class Engine {
    private String engine;
    private int power;
    private int displacement;
    private String efficiency;
    private String displacementStr;

    public Engine(String engine, int power, int displacement, String efficiency) {
        this.engine = engine;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String engine, int power, String efficiency) {
        this(engine , power , 0, efficiency);
        this.efficiency = efficiency;
    }
    public Engine(String engine , String displacementStr, int power){
        this(engine, power , displacementStr);
        this.displacementStr = "n/a";
    }

    public Engine(String engine, int power, int displacement) {
        this(engine , power , displacement , "n/a");
        this.displacement = displacement;
    }

    public int getPower() {
        return this.power;
    }

    public String getEngine() {
        return this.engine;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public String getDisplacementStr() {
        return this.displacementStr;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
