import java.util.ArrayList;

public class Perk {
    private ArrayList<Perk> shopPerks = new ArrayList<>();
    private ArrayList<Perk> tierOnes = new ArrayList<>();
    private ArrayList<Perk> tierTwos = new ArrayList<>();
    private ArrayList<Perk> tierThrees = new ArrayList<>();
    private ArrayList<Perk> tierFours = new ArrayList<>();
    private ArrayList<Perk> tierFives = new ArrayList<>();
    private ArrayList<Perk> tierSixes = new ArrayList<>();
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
    public void addShopFood(Perk perk){
        shopPerks.add(perk);
    }
    public void addTierOne(Perk perk){
        tierOnes.add(perk);
    }
    public void addTierTwo(Perk perk){
        tierTwos.add(perk);
    }
    public void addTierThree(Perk perk){
        tierThrees.add(perk);
    }
    public void addTierFour(Perk perk){
        tierFours.add(perk);
    }
    public void addTierFive(Perk perk){
        tierFives.add(perk);
    }
    public void addTierSix(Perk perk){
        tierSixes.add(perk);
    }
    public ArrayList<Perk> getTierOnes(){
        return tierOnes;
    }
    public ArrayList<Perk> getTierTwos(){
        return tierTwos;
    }
    public ArrayList<Perk> getTierThrees(){
        return tierThrees;
    }
    public ArrayList<Perk> getTierFours(){
        return tierFours;
    }
    public ArrayList<Perk> getTierFives(){
        return tierFives;
    }
    public ArrayList<Perk> getTierSixes(){
        return tierSixes;
    }

    public ArrayList<Perk> getShopPerks() {
        return shopPerks;
    }
    public Perk getShopPerk(int shopPosition){
        return shopPerks.get(shopPosition);
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
