public class Flamingo extends Pet{
    public Flamingo(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getFaint()){
            if(getTeamIndex() < 5) {
                super.getTeam().get(super.getTeamIndex() - 1).addAttack(super.getLevel());
                super.getTeam().get(super.getTeamIndex() - 1).addHealth(super.getLevel());
            }
            if(getTeamIndex() < 4) {
                super.getTeam().get(super.getTeamIndex() - 2).addAttack(super.getLevel());
                super.getTeam().get(super.getTeamIndex() - 2).addHealth(super.getLevel());
            }
        }
    }
}
