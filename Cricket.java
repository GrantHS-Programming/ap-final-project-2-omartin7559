import java.util.ArrayList;

public class Cricket extends Pet{
    private ArrayList team = getTeam();
    public Cricket(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        Pet zombieCricket = new Pet("zombie cricket",getLevel(),1,getLevel(),getLevel(), "none", "none");
        if(getFaint() && getTeam().size() < 5){
           team.add(zombieCricket);
        }
    }
}
