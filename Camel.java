public class Camel extends Pet{
    public Camel(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getHurt() && super.getTeam().get(getPosition()-1) != null){
            super.getTeam().get(getPosition()+1).addAttack(2*getLevel());
            super.getTeam().get(getPosition()+1).addHealth(2*getLevel());

        }
    }
}
