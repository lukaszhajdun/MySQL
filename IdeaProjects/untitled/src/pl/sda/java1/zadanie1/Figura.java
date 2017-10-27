package pl.sda.java1.zadanie1;

/**
 * Created by RENT on 2017-06-27.
 */
public class Figura {
    private int a;
    private int b;

    public Figura(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = Math.abs(b);
        }
        this.a = a;
        this.b = b;
    }

    public int obliczPole() {
        return a * b;
    }

    public int obliczObwod() {
        return 2 * (a + b);
    }
}
