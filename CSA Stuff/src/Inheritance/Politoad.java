package Inheritance;

public class Politoad extends Poliwhirl {
    public Politoad () {
        super(0);
        changeHealth(90);
        changeStrength(90);
        changeSpeed(70);
        changeName("Politoad");
        changeAbility("Drizzle");
    }
    public void useMove () {
        System.out.println("Politoad used weather ball!");
    }
    public void useDrizzle () {
        System.out.println(getName() + "made it rain");
    }
}
