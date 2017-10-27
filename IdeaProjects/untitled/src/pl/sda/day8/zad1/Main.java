package pl.sda.day8.zad1;

/**
 * Created by RENT on 2017-07-06.
 */
public class Main {
    public static void main(String[] args) {
        Place komin = new Place("Krzywy Komin", 4);
        Place hex = new Place("Hex", 1);
        Place czajownia = new Place("czajownia", 2);

        Trip thursday = new Trip();

        thursday.addPlace(komin);
        thursday.addPlace(hex);
        thursday.addPlace(czajownia);

        thursday.printRoude();
        System.out.println("------");

        thursday.removePlace(komin);

        thursday.printRoude();
        System.out.println("Zwiedzanie zajmie: " + thursday.calculateDuration());

        System.out.println("------");

        Place noweHoryzonty = new Place("Nowe Horyzonty", 3);
        Place rynek = new Place("Rynek", 12);

        thursday.setPlace(0, noweHoryzonty);
        thursday.setPlace(10000, rynek);

        thursday.printRoude();
        System.out.println("Zwiedzanie zajmie: " + thursday.calculateDuration());

    }
}
