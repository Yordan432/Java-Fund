package pokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        LinkedHashMap<String , Trainer> trainers = new LinkedHashMap<>();
        while (!"Tournament".equals(line)){
            String[] params = line.split("\\s+");
            String trainerName = params[0];
            String pokemonName = params[1];
            String pokemonElement = params[2];
            int pokemonHealt = Integer.valueOf(params[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName , pokemonElement , pokemonHealt);
            trainer.addPokemon(pokemon);

            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).addPokemon(pokemon);
            } else {
                trainers.put(trainerName, trainer);
            }
            line = reader.readLine();
        }
        String command = reader.readLine();
        while (!"End".equals(command)){
            for (String s : trainers.keySet()) {
                if (trainers.get(s).checkForElement(command)){
                    trainers.get(s).addBadge();
                } else {
                    trainers.get(s).increaseHealth();
                }
            }
            command = reader.readLine();
        }
        trainers.entrySet().stream().sorted((t1, t2) -> {
            return Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges());
        }).forEach(trainer -> System.out.println(trainer.getValue()));
    }
}
