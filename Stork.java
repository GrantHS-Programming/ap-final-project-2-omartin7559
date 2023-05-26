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
        else if(getFaint() && getLevel() == 2){
            int rand = (int) (Math.random() * super.getTierThrees().size());
            Pet pet1 = super.getTierThrees().get(rand);
            pet1.addAttack(getAttack());
            pet1.addHealth(getHealth());
            super.addPet(pet1);
        }
        else if(getFaint() && getLevel() == 3){
            int rand = (int) (Math.random() * super.getTierThrees().size());
            Pet pet1 = super.getTierThrees().get(rand);
            pet1.addAttack(getAttack()*2);
            pet1.addHealth(getHealth()*2);
            super.addPet(pet1);
        }
    }
}
