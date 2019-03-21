import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("Geraldine"));
        players.add(new Mage("Bo"));
        players.add(new Priest("Pepega"));
        players.add(new Paladin("Chika"));

        System.out.println(players.size());

        for (PlayerCharacter x : players) {
            if (x instanceof Priest) {
                System.out.println("Here is a priest:");
                x.showStats();
            } else if (x instanceof Fighter) {
                System.out.println("Here is a fighter");
                x.showStats();
            } else if (x instanceof Mage) {
                System.out.println("Here is a mage");
                x.showStats();
            } else if (x instanceof Paladin) {
                System.out.println("Here is a paladin");
                x.showStats();
            }
        }
    }
}
