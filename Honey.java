public class Honey extends Perk{
    public Honey(String name, String ability, int numUses, int damageAdded, int damageReduced, int tier) {
        super(name, ability, numUses, damageAdded, damageReduced, tier);
    }
    public void activatePerk(Pet pet){
        Pet bee = new Pet("Honey Bee",1,1,1,1,"none","");
        if(pet.getFaint() && pet.getPerk().getName().equals("honey")){
            pet.addPet(bee);
        }
    }
}
