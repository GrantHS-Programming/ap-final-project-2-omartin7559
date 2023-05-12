public class Ant extends Pet{
    public Ant(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getFaint()){
            int petIndex = (int) (Math.random()*super.getTeam().size());
            Pet pet1 = (Pet) super.getTeam().remove(petIndex);
            pet1.addAttack(2*super.getLevel());
            pet1.addHealth(super.getLevel());
            super.addPet(petIndex, pet1);
        }
    }
}
