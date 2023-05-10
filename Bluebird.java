public class Bluebird extends Pet{
    public Bluebird(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getEndTurn()){
            int petIndex = (int) (Math.random()*super.getTeam().size());
            Pet pet1 = (Pet) super.getTeam().remove(petIndex);
            pet1.addAttack(getLevel());
            super.addPet(petIndex, pet1);

        }
    }
}
