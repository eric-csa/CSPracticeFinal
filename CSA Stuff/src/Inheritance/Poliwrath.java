package Inheritance;

public class Poliwrath extends Poliwhirl {
    public Poliwrath (int fistStrength) {
        super(2 * fistStrength);
        changeHealth(90);
        changeStrength(95);
        changeSpeed(70);
        changeName("Poliwrath");
        changeAbility("Fighter");
    }
    public void useMove () {
        if (getSpeed() > 80) {
            System.out.println(getName() + "used quick attack!");
        }
        if (getStrength() > 80) {
            bellyFlop();
        }
        System.out.println("Poliwrath used dynamic punch!");
    }
    public void bellyFlop () {
        System.out.println("Poliwrath used body slam!");
    }
}
