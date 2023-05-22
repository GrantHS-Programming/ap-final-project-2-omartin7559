import java.util.ArrayList;
import java.util.Scanner;

public class FinalProject {
    static Scanner myScanner = new Scanner(System.in);
    static ArrayList<Pet> shop = new ArrayList<>();
    static int petTier = 1;
    static int turn = 0;
    //pets
    static Pet pet = new Pet("", 0, 0, 0, 0, "","");
    static Ant ant = new Ant("Ant", 1, 1, 2, 1, "Faint: Give one random friend +2/+1.", "faint");
    static Cricket cricket = new Cricket("Cricket", 1, 1, 1, 2, "Faint: Summon a 1/1 zombie cricket.", "faint");
    static Bluebird bluebird = new Bluebird("Bluebird", 1, 1, 2, 1, "End Turn: Give one random friend +1 attack.", "end turn");
    static Duck duck = new Duck("Duck", 1, 1, 2, 3, "Sell: Give shop pets +1 health.", "sell");
    static Stork stork = new Stork("Stork",1,2,1,1,"Faint: Summon a random tier 3 pet.", "faint");
    static Peacock peacock = new Peacock("Peacock",1,2,2,5,"Hurt: Gain +4 attack.","hurt");

    //foods
    static Food apple = new Food("Apple",1,1,1,1);
    static Food broccoli = new Food("Broccoli",2,-1,3,1);
    static Food salad = new Food("Salad",3,1,1,2);
    static Food pear = new Food("Pear",4,2,2,1);
    static Food sushi = new Food("Sushi",5,1,1,3);
    static Food pizza = new Food("Pizza",6,2,2,2);
    static Food chicken = new Food("Chicken",6,3,3,1);

    //perks
    static Honey honey = new Honey("Honey","Summon a 1/1 honey bee on faint",1, 0, 0, 1);


    public static void main(String[] args) {
        pet.addShopPet(cricket);
        pet.addShopPet(ant);
        pet.addShopPet(bluebird);
        pet.addShopPet(duck);
        roll();
        startTurn();
        game();




    }
    public static void endTurn(){
        pet.setEndTurn();
    }
    public static void startTurn(){
        pet.addShopTier(pet.getTierOnes());
        turn++;
        if(turn % 2 == 1 && petTier < 6){
            petTier++;
            if(petTier == 2){
                pet.addShopTier(pet.getTierTwos());
            }
            else if(petTier == 3){
                pet.addShopTier(pet.getTierThrees());
            }
            else if(petTier == 4){
                pet.addShopTier(pet.getTierFours());
            }
            else if(petTier == 5){
                pet.addShopTier(pet.getTierFives());
            }
            else{
                pet.addShopTier(pet.getTierSixes());
            }

        }
    }
    public static void buy(int shopPosition){
        pet.addPet(shop.get(shopPosition));
        pet.setGold(shop.get(shopPosition).getCost());
    }
    public static void roll(){
        shop.clear();
        pet.addTierOne(ant);
        pet.addTierOne(cricket);
        pet.addTierOne(bluebird);
        pet.addTierOne(duck);
        pet.addTierTwo(stork);
        pet.addTierTwo(peacock);
        for(int a = 0; a < 3; a++) {
            int pets = (int) (Math.random() * pet.getShop().size());
            shop.add(pet.getShopPet(pets));
        }
        System.out.println(shop);
    }
    public static void game(){
        myScanner.useDelimiter("\\n");
        String quit = "";
        while(!quit.equals("quit")) {
            System.out.println("What would you like to do? (roll, buy, sell, end turn, quit):  ");
            if(myScanner.next().equals("quit")){
                System.out.println("you quit the game.");
                quit = "quit";
            }
            if(myScanner.next().equals("roll")){
                roll();
            }
            if(myScanner.next().equals("buy")){
                System.out.println("What shop position is the pet in? (starting with 0): ");
                int hi = myScanner.nextInt();
                buy(hi);
                System.out.println(pet.getTeam());
            }
            if(myScanner.next().equals("sell")){

            }
        }
    }

}
