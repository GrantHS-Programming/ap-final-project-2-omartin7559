public class Crocodile extends Pet{
    public Crocodile(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        getEnemyTeam().get(4).takeDamage(8*getLevel());
    }
}
