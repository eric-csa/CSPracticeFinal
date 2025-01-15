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
}
