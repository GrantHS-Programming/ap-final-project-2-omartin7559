import java.util.ArrayList;

public class FinalProject {
    static Cricket crick = new Cricket("cricket",1,1,1,2,"summon a 1/1 cricket on faint","faint");
    static ArrayList<Pet> shop = new ArrayList<>();
    public static void roll(){
        crick.addPet(crick);
        System.out.println(crick.getTeam());
    }



    public static void main(String[] args) {
        roll();

    }
}
