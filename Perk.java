public class Perk {
    private String name;
    private String ability;
    private int numUsesInBattle;
    private int damageAdded;
    private int damageReduced;
    private int tier;
    private int cost;
    public Perk(String name, String ability, int numUsesInBattle, int damageAdded, int damageReduced, int tier){
        this.name = name;
        this.ability = ability;
        this.numUsesInBattle = numUsesInBattle;
        this.damageAdded = damageAdded;
        this.damageReduced = damageReduced;
        this.tier = tier;
        cost = 3;
    }
    public String getAbility(){
        return ability;
    }
    public int getNumUses(){
        return numUsesInBattle;
    }
    public int getTier(){
        return tier;
    }
    public String getName(){
        return name;
    }
    public int getDamageAdded(){
        return damageAdded;
    }
    public int getDamageReduced(){
        return damageReduced;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int discount){
        cost = cost - discount;
    }
    public String toString(){
        return name + ", " + ability;
    }
    public void addPerk(Pet pet, Perk perk){
        pet.setPerk(perk);
    }
    public void activatePerk(Pet pet){

    }
}
