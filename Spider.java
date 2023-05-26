public class Spider extends Pet{
    public Spider(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility() {
        if (getFaint() && getLevel() == 1) {
            int rand = (int) (Math.random() * super.getTierTwos().size());
            Pet pet1 = super.getTierTwos().get(rand);
            super.addPet(pet1);
        }
        else if(getFaint() && getLevel() == 2){
            int rand = (int) (Math.random() * super.getTierTwos().size());
            Pet pet1 = super.getTierTwos().get(rand);
            pet1.addAttack(getAttack());
            pet1.addHealth(getHealth());
            super.addPet(pet1);
        }
        else if(getFaint() && getLevel() == 3){
            int rand = (int) (Math.random() * super.getTierTwos().size());
            Pet pet1 = super.getTierTwos().get(rand);
            pet1.addAttack(getAttack()*2);
            pet1.addHealth(getHealth()*2);
            super.addPet(pet1);
        }
    }
}
