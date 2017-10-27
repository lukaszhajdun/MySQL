package pl.sda.java1.zadanie1;

/**
 * Created by RENT on 2017-06-27.
 */

public class Uczestnik {
    private String imie; //Deklaracje
    private boolean obecny; //Deklaracje
    private int wiek; //Deklaracje

    public Uczestnik(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;


    }

    public boolean obecny() {
        return obecny;
    }

    public void ustawObecnosc() {
        obecny = true;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "imie='" + imie + '\'' +
                ", obecny=" + obecny +
                ", wiek=" + wiek +
                '}';
    }
}

