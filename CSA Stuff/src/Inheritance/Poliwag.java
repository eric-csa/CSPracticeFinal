package Inheritance;

public class Poliwag extends Pokemon {
    private String ability;

    public Poliwag () {
        super(40, 50, 90, "Poliwag");
        ability = "Damp";
    }
    public String getAbility() {
        return ability;
    }
    public void changeAbility (String ability) {
        this.ability = ability;
    }
    public void useMove () {
        if (ability == "Damp") {
            System.out.println("Poliwag used water gun!");

            return;
        }
        System.out.println("Poliwag used tackle!");
    }
}
