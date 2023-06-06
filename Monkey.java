public class Monkey extends Pet{
    public Monkey(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getTeam().get(0) != null){
            getTeam().get(0).addAttack(2*getLevel());
            getTeam().get(0).addHealth(3*getLevel());
        }
    }
}
