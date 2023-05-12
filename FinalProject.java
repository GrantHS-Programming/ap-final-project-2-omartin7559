import java.util.ArrayList;

public class FinalProject {
    static ArrayList<Pet> shopPets = new ArrayList<>();
    static int petTier = 1;
    static int turn = 1;
    static int gold = 10;
    static Pet pet = new Pet("", 0, 0, 0, 0, "","");
    static Ant ant = new Ant("Ant", 1, 1, 2, 1, "Give one random friend +2/+1.", "faint");
    static Cricket cricket = new Cricket("Cricket", 1, 1, 1, 2, "Summon a 1/1 zombie cricket", "faint");
    static Bluebird bluebird = new Bluebird("Bluebird", 1, 1, 2, 1, "Give one random friend +1 attack.", "end turn");
    static Duck duck = new Duck("Duck", 1, 1, 2, 3, "Give shop pets +1 health.", "sell");
    public static void main(String[] args) {
        pet.addShopPet(cricket);
        pet.addShopPet(ant);
        pet.addShopPet(bluebird);
        pet.addShopPet(duck);
        roll();



    }
    public static void roll(){
        for(int a = 0; a < 10; a++) {
            for (int i = 0; i < 4; i++) {
                int pets = (int) (Math.random() * pet.getShopSize());
                System.out.println(pets);
            }
        }

    }
}
