public class Peacock extends Pet{
    public Peacock(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getHurt()){
            super.addAttack(4*getLevel());
        }
    }
}
