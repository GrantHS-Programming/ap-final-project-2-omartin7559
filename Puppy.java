public class Puppy extends Pet{
    public Puppy(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getEndTurn() && getGold() >= 2){
            super.addAttack(2*getLevel());
            super.addHealth(getLevel());
        }
    }
}
