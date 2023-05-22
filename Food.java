public class Food {
    private String name;
    private int tier;
    private int attack;
    private int health;
    private int cost;
    private int targets;
    public Food(String name, int tier, int attack, int health, int targets){
        this.name = name;
        this.tier = tier;
        this.attack = attack;
        this.health = health;
        this.targets = targets;
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
