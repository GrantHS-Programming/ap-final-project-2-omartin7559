public class Duck extends Pet{
    public Duck(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        if(getSell()){
            for(int a = 0; a < super.getShop().size(); a++){
                Pet pet2 = (Pet) super.getTeam().remove(a);
                pet2.addHealth(getLevel());
                super.addPet(pet2);

            }
        }
    }
}
