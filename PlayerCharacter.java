public abstract class PlayerCharacter {

    protected String name;

    protected int strength;
    protected int intelligence;
    protected int agility;

    protected int hp, hpmax;
    protected int mp, mpmax;

    public PlayerCharacter() {

        System.out.println("A new PlayerCharacter!");

    }

    public void showStats() {
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
        System.out.printf("STR: %3d\nINT: %3d\nAGI: %3d\n",strength,intelligence,agility);
    }
}
