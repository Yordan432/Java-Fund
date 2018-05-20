import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> lastTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.lastTeam = new ArrayList<>();
    }

    public void addPlayer(Person player){
        if(player.getAge() < 40){
            this.firstTeam.add(player);
        }else {
            this.lastTeam.add(player);
        }
    }

    List<Person> getFirstTeam(){
        return Collections.unmodifiableList(firstTeam);
    }

    List<Person> getLastTeam(){
        return Collections.unmodifiableList(lastTeam);
    }
}
