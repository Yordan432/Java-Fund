package carSalesman;

import java.util.List;

public class Car {
    private String model;
    private String engine;
    private int weight;
    private String color;
    private String weightStr;

    private List<Engine> dateEngine;

    public Car(String model, String engine, String color , List<Engine> dateEngine) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.weightStr = "n/a";
        this.dateEngine = dateEngine;
    }
    public Car(String model , String engine , int weight , String color , List<Engine> dateEngine){
        this(model , engine , color , dateEngine);
        this.weight = weight;
    }

    public Car(String model , String engine , List<Engine> dateEngine){
        this(model , engine , "n/a" , dateEngine);
    }

    public String getEngine() {
        return this.engine;
    }
    public int getPower(Engine en){
        return en.getPower();
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    public String getWeightStr() {
        return this.weightStr;
    }
}
