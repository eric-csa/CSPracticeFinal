package Inheritance;

public class Pokemon {
    private int health;
    private int strength;
    private int speed;
    private String name;

    public Pokemon (int health, int strength, int speed, String name) {
        this.health = health;
        this.strength = strength;
        this.speed = speed;
    }
    public int getHealth () {
        return health;
    }
    public int getStrength () {
        return strength;
    }
    public int getSpeed () {
        return speed;
    }
    public String getName () {
        return name;
    }
    public void useMove () {
        System.out.println(name + " doesn't have a move!");
    }
    public void changeHealth (int health) {
        this.health = health;
    }
    public void changeSpeed (int speed) {
        this.speed = speed;
    }
    public void changeStrength (int strength) {
        this.strength = strength;
    }
    public void changeName (String name) {
        this.name = name;
    }
    public boolean winsFight (Pokemon other) {
        int curHealth = health;
        int otherHealth = other.health;

        if (speed > other.speed) {
            while (true) {
                otherHealth -= strength;

                if (otherHealth <= 0) {
                    return true;
                }
                curHealth -= other.strength;

                if (curHealth <= 0) {
                    return false;
                }
            }
        }
        else {
            while (true) {
                curHealth -= other.strength;

                if (curHealth <= 0) {
                    return false;
                }
                otherHealth -= strength;

                if (otherHealth <= 0) {
                    return true;
                }
            }
        }
    }
}
