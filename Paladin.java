import java.util.Random;

public class Paladin extends PlayerCharacter{

    private int wisdom;
    private int constitution;

    public Paladin(String newName){
        name = newName;
        System.out.println("A paladin named " + name + " has been created");

        Random rand = new Random();

        strength = 10 + (rand.nextInt(6));
        agility = 5 + (rand.nextInt(6));
        intelligence = 15 + (rand.nextInt(6));
        wisdom = 10 + (rand.nextInt(6));
        constitution = 10 +(rand.nextInt(6));

        hp = hpmax = strength + (constitution * 2);
        mp = mpmax = intelligence + (wisdom * 2);

    }
    public void showStats() {
        System.out.printf("%s, a Paladin:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\nCON: %3d\n",strength,intelligence,agility,wisdom,constitution);
    }
}
