public class Bison extends Pet{
    public Bison(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        for(int a = 0; a < getTeam().size(); a++){
            if(getTeam().get(a).getLevel() == 3){
                addAttack(2*getLevel());
                addHealth(2*getLevel());
            }
        }
    }
}
