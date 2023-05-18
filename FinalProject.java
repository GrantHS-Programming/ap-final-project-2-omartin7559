import java.util.ArrayList;

public class FinalProject {
    static ArrayList<Pet> shopPets = new ArrayList<>();
    static int petTier = 1;
    static int turn = 0;
    static int gold = 10;
    static Pet pet = new Pet("", 0, 0, 0, 0, "","");
    static Ant ant = new Ant("Ant", 1, 1, 2, 1, "Give one random friend +2/+1.", "faint");
    static Cricket cricket = new Cricket("Cricket", 1, 1, 1, 2, "Summon a 1/1 zombie cricket", "faint");
    static Bluebird bluebird = new Bluebird("Bluebird", 1, 1, 2, 1, "Give one random friend +1 attack.", "end turn");
    static Duck duck = new Duck("Duck", 1, 1, 2, 3, "Give shop pets +1 health.", "sell");
    static Stork stork = new Stork("Stork",1,2,1,1,"Summon a random tier 3 pet", "faint");
    public static void main(String[] args) {
        pet.addShopPet(cricket);
        pet.addShopPet(ant);
        pet.addShopPet(bluebird);
        pet.addShopPet(duck);
        startTurn();
        roll();



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
    public static void roll(){
        pet.addTierOne(ant);
        pet.addTierOne(cricket);
        pet.addTierOne(bluebird);
        pet.addTierOne(duck);
        pet.addTierTwo(stork);
        for(int a = 0; a < 10; a++) {
            for (int i = 0; i < 4; i++) {
                int pets = (int) (Math.random() * pet.getShopSize());
                System.out.println(pet.getShopPet(pets));
            }
        }

    }
}
