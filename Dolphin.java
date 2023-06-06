public class Dolphin extends Pet{
    public Dolphin(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        getEnemyTeam().get(0).takeDamage(4*getLevel());
    }
}
