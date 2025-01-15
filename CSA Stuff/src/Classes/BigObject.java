package Classes;

public class BigObject {
    private int a;
    private int b;
    private int c;
    public BigObject () {
        a = 0;
        b = 0;
        c = 0;
    }
    public BigObject (int a, int b) {
        this.a = a;
        this.b = b;
        c = 4;
    }
    public BigObject (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int findMin () {
        return Math.min(a, Math.min(b, c));
    }
    public void printingPress (int x) {
        System.out.println(x - a + x - b + x - findMin());
    }
    public void printingPress (int x, int y) {
        System.out.println(x - a + y + b - y * findMin());
    }
    public void iAmBroken () {
        System.out.println(a / (b - c));
    }
    public boolean isGreater (BigObject other) {
        if (a > other.a) {
            return true;
        }
        return findMin() > other.findMin();
    }
    public int getWeirdA (int a) {
        return this.a + b - c + a;
    }
    public String toString () {
        if (a < b) {
            return a + " " + b + " " + c;
        }
        return a + "/n" + b + " " + c;
    }
}
