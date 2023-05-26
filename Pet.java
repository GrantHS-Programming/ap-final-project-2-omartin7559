import java.util.ArrayList;

public class Pet {
    private ArrayList<Pet> team = new ArrayList<>();
    private ArrayList<Pet> enemyTeam = new ArrayList<>();
    private ArrayList<Pet> shop = new ArrayList<>();
    private ArrayList<Pet> tierOnes = new ArrayList<>();
    private ArrayList<Pet> tierTwos = new ArrayList<>();
    private ArrayList<Pet> tierThrees = new ArrayList<>();
    private ArrayList<Pet> tierFours = new ArrayList<>();
    private ArrayList<Pet> tierFives = new ArrayList<>();
    private ArrayList<Pet> tierSixes = new ArrayList<>();
    private String ability;
    private static int level;
    private String name;
    private int cost;
    private int sellValue;
    private int health;
    private int attack;
    private int tier;
    private String abilityTime;
    private boolean sell;
    private boolean endTurn ;
    private boolean startTurn;
    private boolean faint;
    private boolean beforeAttack;
    private boolean hurt;
    private int position;
    private Perk perk;
    private int gold = 10;
    private int teamIndex;

    public Pet(String name, int level, int tier, int attack, int health, String ability, String abilityTime){
        this.name = name;
        this.level = level;
        this.tier = tier;
        this.attack = attack;
        this.health = health;
        cost = 3;
        sellValue = level;
        this.ability = ability;
        this.abilityTime = abilityTime;


    }
    public static void setLevel(int newLevel){
        level = newLevel;
    }
    public ArrayList<Pet> getEnemyTeam(){
        return enemyTeam;
    }
    public void addEnemy(Pet pet){
        enemyTeam.add(pet);
    }
    public void setTeamIndex(Pet pet, int location){
        team.add(location,pet);
    }
    public int getTeamIndex(){
        return teamIndex;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int discount){cost = cost - discount;}
    public int getSellValue(){
        return sellValue;
    }
    public void setPosition(int newPosition){position = newPosition;}
    public int getPosition(){return position;}
    public String getAbility(){
        return ability;
    }
    public String getAbilityTime(){return abilityTime;}
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getAttack(){
        return attack;
    }
    public int getHealth(){
        return health;
    }
    public int getTier(){
        return tier;
    }
    public void addAttack(int newAttack){
        attack += newAttack;
    }
    public void addHealth(int newHealth){
        health += newHealth;
    }
    public String toString(){
        return "This pet is a level " + level +" tier "+ tier + " " + name + " with base stats " + attack + "/" + health;
    }
    public void sell(Pet pet){
        team.remove(pet);
        sell = true;
        gold += level;
    }
    public void buy(Pet pet, int shopPosition){
        team.add(pet);
        gold -= cost;
    }
    public void setGold(int goldSubtracted){
        gold -= goldSubtracted;
    }
    public int getGold(){
        return gold;
    }
    public boolean getSell(){
        return sell;
    }
    public void setEndTurn(){
        endTurn = true;
    }
    public boolean getEndTurn(){
        return endTurn;
    }
    public void setStartTurn(){
        startTurn = true;
    }
    public boolean getStartTurn(){
        return startTurn;
    }
    public void setFaint(){
        faint = true;
    }
    public boolean getFaint(){
        return faint;
    }
    public void setBeforeAttack(){
        beforeAttack = true;
    }
    public boolean getBeforeAttack(){
        return beforeAttack;
    }
    public void setHurt(){
        hurt = true;
    }
    public boolean getHurt(){
        return hurt;
    }
    public ArrayList<Pet> getTeam(){
        return team;
    }
    public ArrayList<Pet> getShop(){
        return shop;
    }
    public int getShopSize(){
        return shop.size();
    }
    public int getTeamSize(){
        return team.size();
    }
    public void printTeam(){
        System.out.println(team);
    }
    public void printShop(){
        System.out.println(shop);
    }
    public void addPet(int index, Pet pet){
        team.add(index, pet);
    }
    public void addPet(Pet pet){
        team.add(pet);
    }
    public void removePet(Pet pet){
        team.remove(pet);
    }
    public void addShopPet(Pet pet){
        shop.add(pet);
    }
    public void removeShopPet(Pet pet){
        shop.remove(pet);
    }
    public void activateAbility(){
        System.out.println("");
    }
    public Pet getShopPet(int index){
        return shop.get(index);
    }
    public Perk getPerk(){
        return perk;
    }
    public void setPerk(Perk newPerk){
        perk = newPerk;
    }
    public void addTierOne(Pet pet){
        tierOnes.add(pet);
    }
    public void addTierTwo(Pet pet){
        tierTwos.add(pet);
    }
    public void addTierThree(Pet pet){
        tierThrees.add(pet);
    }
    public void addTierFour(Pet pet){
        tierFours.add(pet);
    }
    public void addTierFive(Pet pet){
        tierFives.add(pet);
    }
    public void addTierSix(Pet pet){
        tierSixes.add(pet);
    }
    public void addShopTier(ArrayList<Pet> newTier){
        shop.addAll(newTier);
    }
    public void freeze(Pet shopPet){

    }
    public ArrayList<Pet> getTierOnes(){
        return tierOnes;
    }
    public ArrayList<Pet> getTierTwos(){
        return tierTwos;
    }
    public ArrayList<Pet> getTierThrees(){
        return tierThrees;
    }
    public ArrayList<Pet> getTierFours(){
        return tierFours;
    }
    public ArrayList<Pet> getTierFives(){
        return tierFives;
    }
    public ArrayList<Pet> getTierSixes(){
        return tierSixes;
    }

}
