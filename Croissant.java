public class Croissant extends Perk{

    public Croissant(String name, String ability, int numUsesInBattle, int damageAdded, int damageReduced, int tier, String timeUsed) {
        super(name, ability, numUsesInBattle, damageAdded, damageReduced, tier, timeUsed);
    }

    public void activatePerk(Pet pet){
        if(pet.getEndTurn()){
            pet.addAttack(1);
        }
    }
}
