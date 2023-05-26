public class CannedFood extends Food{

    public CannedFood(String name, int tier, int attack, int health, int targets, String ability) {
        super(name, tier, attack, health, targets, ability);
    }
    public void activateAbility(){
        Pet pet = new Pet("",0,0,0,0,"","");
        for(int a = 0; a < pet.getShopSize(); a++){
            pet.getShop().get(a).addAttack(1);
            pet.getShop().get(a).addHealth(1);
        }
    }
}
