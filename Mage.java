import java.util.Random;

public class Mage extends PlayerCharacter {

    private int wisdom;

    public Mage(String newName){
        name = newName;
        System.out.println("A mage named " + name + " has been created");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6));
        agility = 8 + (rand.nextInt(6));
        intelligence = 15 + (rand.nextInt(6));
        wisdom = 10 + (rand.nextInt(6));

        hp = hpmax = strength;
        mp = mpmax = intelligence + (wisdom *2);

    }
    public void showStats() {
        System.out.printf("%s, a Fighter:\n",name);
        super.showStats();
        System.out.printf("WIS: %3d\n",wisdom);
    }
}

