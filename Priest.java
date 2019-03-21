import java.util.Random;

public class Priest extends PlayerCharacter {

    private int charisma;

    public Priest(String newName){
        name = newName;
        System.out.println("A priest named " + name + " has been created");

        Random rand = new Random();

        strength = 7 + (rand.nextInt(6));
        agility = 8 + (rand.nextInt(6));
        intelligence = 15 + (rand.nextInt(6));
        charisma = 10 + (rand.nextInt(6));

        hp = hpmax = strength;
        mp = mpmax = intelligence + (charisma *2);

    }
    public void showStats() {
        System.out.printf("%s, a Fighter:\n",name);
        super.showStats();
        System.out.printf("CHA: %3d\n",charisma);
    }
}
