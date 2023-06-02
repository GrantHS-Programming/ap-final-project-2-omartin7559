public class Cucumber extends Perk{

    public Cucumber(String name, String ability, int numUsesInBattle, int damageAdded, int damageReduced, int tier, String timeUsed) {
        super(name, ability, numUsesInBattle, damageAdded, damageReduced, tier, timeUsed);
    }

    public void activatePerk(Pet pet){
        if(pet.getEndTurn()){
            pet.addHealth(1);
        }

    }
}
