package pokemonTrainer;
public class Pokemon {
    private String name;
    private String element;
    private int healt;


    public Pokemon(String name, String element, int healt) {
        this.name = name;
        this.element = element;
        this.healt = healt;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealt() {
        return this.healt;
    }

    public String getElement() {
        return this.element;
    }
    public void incrementHealt(){
        this.healt -=10;
    }
}
