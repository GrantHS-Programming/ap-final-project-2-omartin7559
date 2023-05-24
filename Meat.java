public class Meat extends Perk{
    public Meat(String name, String ability, int numUsesInBattle, int damageAdded, int damageReduced, int tier) {
        super(name, ability, numUsesInBattle, damageAdded, damageReduced, tier);
    }
    public void activatePerk(Pet pet){
        if(pet.getPerk().getName().equals("meat")){
            pet.addAttack(4);
        }

    }
}
