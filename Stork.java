public class Stork extends Pet{
    public Stork(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getFaint()){
            int rand = (int) (Math.random()*super.getTierThrees().size());
            Pet pet1 = super.getTierThrees().get(rand);
            super.addPet(pet1);
        }
    }
}
