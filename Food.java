import java.util.ArrayList;

public class Food {
    private ArrayList<Food> shopFoods = new ArrayList<>();
    private ArrayList<Food> tierOnes = new ArrayList<>();
    private ArrayList<Food> tierTwos = new ArrayList<>();
    private ArrayList<Food> tierThrees = new ArrayList<>();
    private ArrayList<Food> tierFours = new ArrayList<>();
    private ArrayList<Food> tierFives = new ArrayList<>();
    private ArrayList<Food> tierSixes = new ArrayList<>();
    private String name;
    private int tier;
    private int attack;
    private int health;
    private int cost;
    private int targets;
    private String ability;
    public void addShopFood(Food food){
        shopFoods.add(food);
    }
    public void addTierOne(Food food){
        tierOnes.add(food);
    }
    public void addTierTwo(Food food){
        tierTwos.add(food);
    }
    public void addTierThree(Food food){
        tierThrees.add(food);
    }
    public void addTierFour(Food food){
        tierFours.add(food);
    }
    public void addTierFive(Food food){
        tierFives.add(food);
    }
    public void addTierSix(Food food){
        tierSixes.add(food);
    }
    public ArrayList<Food> getTierOnes(){
        return tierOnes;
    }
    public ArrayList<Food> getTierTwos(){
        return tierTwos;
    }
    public ArrayList<Food> getTierThrees(){
        return tierThrees;
    }
    public ArrayList<Food> getTierFours(){
        return tierFours;
    }
    public ArrayList<Food> getTierFives(){
        return tierFives;
    }
    public ArrayList<Food> getTierSixes(){
        return tierSixes;
    }

    public ArrayList<Food> getShopFood() {
        return shopFoods;
    }
    public Food getShopFood(int shopPosition){
        return shopFoods.get(shopPosition);
    }
    public String getAbility(){
        return ability;
    }

    public void addShopTier(ArrayList<Food> newShopFoods){
        shopFoods.addAll(newShopFoods);
    }
    public Food(String name, int tier, int attack, int health, int targets, String ability){
        this.name = name;
        this.tier = tier;
        this.attack = attack;
        this.health = health;
        this.targets = targets;
        this.ability = ability;
        cost = 3;
    }
    public void buyFoodMultipleTargets(Food food){
        Pet pet = new Pet("", 0, 0, 0, 0, "","");
        if(food.getTargets() > 1){
            for(int a = 0; a < food.getTargets(); a++){
                int targetIndex = (int) (Math.random()*pet.getTeam().size());
                Pet pet1 = pet.getTeam().remove(targetIndex);
                pet1.addAttack(food.getAttack());
                pet1.addHealth(food.getHealth());
                pet.addPet(targetIndex, pet1);

            }
        }
    }
    public int getTier(){
        return tier;
    }
    public String getName(){
        return name;
    }
    public int getAttack(){
        return attack;
    }
    public int getHealth(){
        return health;
    }
    public int getCost(){
        return cost;
    }
    public int getTargets(){
        return targets;
    }
    public void setCost(int discount){
        cost = cost - discount;
    }
    public String toString(){
        return name + ", gives " + getAttack() + "/" + getHealth() + ".";
    }
    public void buyFoodOneTarget(Pet pet, Food food){
        pet.addAttack(food.getAttack());
        pet.addHealth(food.getHealth());
    }
}
