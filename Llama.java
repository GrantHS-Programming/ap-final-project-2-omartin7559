public class Llama extends Pet{
    public Llama(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getTeam().size() <= 4 && getEndTurn()){
            addAttack(2*getLevel());
            addHealth(2*getLevel());
        }
    }
}
