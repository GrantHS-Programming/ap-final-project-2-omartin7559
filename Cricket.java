public class Cricket extends Pet{
    public Cricket(String name, int level, int tier, int attack, int health, String ability, String abilityTime) {
        super(name, level, tier, attack, health, ability, abilityTime);
    }
    public void activateAbility(){
        Pet zombieCricket = new Pet("zombie cricket",getLevel(),1,getLevel(),getLevel(), "none", "none");
        if(getFaint() && getTeam().size() < 5){
           super.addPet(getPosition(), zombieCricket);
        }
    }
}
