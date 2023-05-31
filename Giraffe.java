public class Giraffe extends Pet {
    public Giraffe(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getEndTurn()){
            if(super.getTeam().get(getPosition()-1) != null){
                super.getTeam().get(getPosition()-1).addAttack(getLevel());
                super.getTeam().get(getPosition()-1).addHealth(getLevel());
            }
        }
    }
}
