package pokemonTrainer;

import java.util.LinkedList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberBadges;
    private LinkedList<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberBadges = 0;
        this.pokemons = new LinkedList<>();
    }

    public void setPokemons(LinkedList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void setNumberBadges(int numberBadges) {
        this.numberBadges = numberBadges;
    }

    public boolean checkForElement (String element) {
        for (int i = 0; i < this.pokemons.size(); i++) {
            if (pokemons.get(i).getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void addBadge(){
        this.numberBadges++;
    }

    public void increaseHealth(){
        LinkedList<Integer> pokemonsForRemove = new LinkedList<>();
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getHealt() - 10 <= 0) {
                pokemonsForRemove.add(i);
            } else {
                pokemons.get(i).incrementHealt();
            }
        }
        this.removePokemons(pokemonsForRemove);
    }

    private void removePokemons (LinkedList<Integer> pokemonIndexes) {
        for (int i = pokemonIndexes.size()-1; i >= 0; i--) {
            pokemons.remove((int)pokemonIndexes.get(i));
        }
    }

    public int getNumberOfBadges() {
        return this.numberBadges;
    }
    @Override
    public String toString() {
        return this.name + " " + this.numberBadges + " " + this.pokemons.size();
    }
}
