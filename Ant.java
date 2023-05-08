import java.util.ArrayList;

public class Ant extends Pet{
    private ArrayList team = getTeam();
    public Ant(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getFaint()){
            int petIndex = (int) (Math.random()*team.size());
            team.get
        }
    }
}
