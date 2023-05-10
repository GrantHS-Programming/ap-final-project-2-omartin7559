import java.util.ArrayList;

public class Pet {
    private ArrayList<Pet> team = new ArrayList<>();
    private String ability;
    private int level;
    private String name;
    private int cost;
    private int sellValue;
    private int health;
    private int attack;
    private int tier;
    private String abilityTime;
    private boolean endTurn ;
    private boolean startTurn;
    private boolean faint;
    private boolean beforeAttack;
    private boolean hurt;
    private int position;

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
    public int getCost(){
        return cost;
    }
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
        return "This pet is a level " + level +" tier "+ tier + " " + name + " with base stats " +
                attack + "/" + health;
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
    public ArrayList getTeam(){
        return team;
    }
    public void addPet(int index, Pet pet){
        team.add(index, pet);
    }
    public void removePet(Pet pet){
        team.remove(pet);
    }
    public void activateAbility(){
        System.out.println("");
    }
}
