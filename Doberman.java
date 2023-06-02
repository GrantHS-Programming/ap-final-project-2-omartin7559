public class Doberman extends Pet{
    public Doberman(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getStartBattle()){
            int num = 0;
            for(int i = 0; i < super.getTeam().size(); i++){
                if(getTeam().get(i).getTier() < getTier()){
                    num++;
                }
            }
            if(num == getTeam().size()){
                Perk coconut = new Perk("Coconut","Pet takes 100% less damage, once",1,0,100,0,"attack");
                addAttack(5*getLevel());
                addHealth(5*getLevel());
                setPerk(coconut);
            }
        }
    }
}
