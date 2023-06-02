public class Honey extends Perk{

    public Honey(String name, String ability, int numUsesInBattle, int damageAdded, int damageReduced, int tier, String timeUsed) {
        super(name, ability, numUsesInBattle, damageAdded, damageReduced, tier, timeUsed);
    }

    public void activatePerk(Pet pet){
        Pet bee = new Pet("Honey Bee",1,1,1,1,"none","");
        if(pet.getFaint() && pet.getPerk().getName().equals("honey")){
            pet.addPet(bee);
        }
    }
}
