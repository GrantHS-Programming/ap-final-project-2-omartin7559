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
    private boolean startBattle;
    private boolean faint;
    private boolean beforeAttack;
    private boolean hurt;
    private int petTier = 1;
    private int turn;
    private int numAttacks;
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
    public int getTurn(){
        return turn;
    }
    public int getPetTier(){
        return petTier;
    }
    public void increaseTurn(){
        turn++;
        if(turn < 11 && turn % 2 != 0){
            petTier++;
        }
    }
    public void setLevel(int newLevel){
        level = newLevel;
    }
    public void levelUp(Pet pet){
        pet.setLevel(level+1);
        if(petTier == 2) {
            int levelPet = (int) (Math.random() * tierThrees.size());
            shop.add(tierThrees.get(levelPet));
        }
        if(petTier == 3) {
            int levelPet = (int) (Math.random() * tierFours.size());
            shop.add(tierFours.get(levelPet));
        }
        if(petTier == 4) {
            int levelPet = (int) (Math.random() * tierFives.size());
            shop.add(tierFives.get(levelPet));
        }
        if(petTier == 5) {
            int levelPet = (int) (Math.random() * tierSixes.size());
            shop.add(tierSixes.get(levelPet));
        }

    }
    public void attack(){
        if(getEnemyTeam().get(position).getAbilityTime().equals("before attack")){
            getEnemyTeam().get(position).activateAbility();
        }
        if(abilityTime.equals("before attack")){
            activateAbility();
        }
        if(getEnemyTeam().get(position).getPerk().getName().equals("Melon")){
            if(attack <=20){
                getEnemyTeam().get(position).takeDamage(0);
            }
            else {
                getEnemyTeam().get(position).takeDamage(attack - 20);
            }
        }
        else if(getEnemyTeam().get(position).getPerk().getName().equals("Garlic")) {
            if(attack <= 2){
                getEnemyTeam().get(position).takeDamage(1);
            }
            else {
                getEnemyTeam().get(position).takeDamage(attack - 2);
            }
        }
        else if(getEnemyTeam().get(position).getPerk().getName().equals("Coconut")) {
            getEnemyTeam().get(position).takeDamage(0);
        }
        else{
            getEnemyTeam().get(position).takeDamage(attack);
        }

        if(getTeam().get(position).getPerk().getName().equals("Melon")){
            if(attack <=20){
                getTeam().get(position).takeDamage(0);
            }
            else {
                getTeam().get(position).takeDamage(attack - 20);
            }
        }
        else if(getTeam().get(position).getPerk().getName().equals("Garlic")) {
            if(attack <= 2){
                getTeam().get(position).takeDamage(1);
            }
            else {
                getTeam().get(position).takeDamage(attack - 2);
            }
        }
        else if(getTeam().get(position).getPerk().getName().equals("Coconut")) {
            getTeam().get(position).takeDamage(0);
        }
        else{
            getTeam().get(position).takeDamage(attack);
        }




        if(getEnemyTeam().get(position).getHealth() <= 0){
            setFaint();
            if(getEnemyTeam().get(position).getAbilityTime().equals("faint")){
                getEnemyTeam().get(position).activateAbility();
            }
            enemyTeam.remove(0);
        }
        if(getHealth() <= 0){
            setFaint();
            if(abilityTime.equals("faint")){
                activateAbility();
            }
            team.remove(position);
        }
        numAttacks++;
    }
    public void breakPerk(Pet pet){
        if(pet.getPerk().getNumUses() == 1 && pet.getNumAttacks() >= 1){
            pet.setPerk(null);
        }
    }
    public int getNumAttacks(){
        return numAttacks;
    }
    public void takeDamage(int damage){
        health = health - damage;
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
    public void setStartBattle(){
        startBattle = true;
    }
    public boolean getStartBattle(){
        return startBattle;
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
