package Inheritance;

public class Poliwhirl extends Poliwag {
    int fistStrength = 0;
    public Poliwhirl (int fistStrength) {
        super();
        changeHealth(65);
        changeSpeed(90);
        changeStrength(65 + this.fistStrength);
        changeName("Poliwhril");
        changeAbility("Water Absorb");
    }
    public void useMove () {
        if (getStrength() >= 70) {
            System.out.println(getName() + " used punch!");

            return;
        }
        System.out.println(getName() + " used water gun!");
    }
}
