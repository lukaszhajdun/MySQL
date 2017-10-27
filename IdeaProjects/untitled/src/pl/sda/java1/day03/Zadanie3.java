package pl.sda.java1.day03;

/**
 * Created by RENT on 2017-06-29.
 */
public class Zadanie3 {
    private int n;

    private char[] tab = {'a', 'b', 'r', 'a', 'k', 'a', 'd', 'a', 'b', 'r', 'a'};

    public Zadanie3(int n) {
        this.n = n;
    }

    public void print() {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; (j < i + 1); j++) {
                System.out.print(tab[(k++ % tab.length)] + " ");

            }
            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "Zadanie3{}";
    }

    public static void main(String[] args) {
        Zadanie3 z3 = new Zadanie3(20); //TU USTALAMY ILE RAZY

        z3.print();
    }


}
