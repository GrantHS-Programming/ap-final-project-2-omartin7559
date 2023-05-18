public class Food {
    private String name;
    private int tier;
    private int attack;
    private int health;
    private int cost;
    public Food(String name, int tier, int attack, int health){
        this.name = name;
        this.tier = tier;
        this.attack = attack;
        this.health = health;
        cost = 3;
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
    public void setCost(int discount){
        cost = cost - discount;
    }
    public String toString(){
        return name + ", gives " + getAttack() + "/" + getHealth() + ".";
    }
    public void buyFood(Pet pet, Food food){
        pet.addAttack(food.getAttack());
        pet.addHealth(food.getHealth());
    }
}
