package pl.sda.java1.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by RENT on 2017-06-27.
 */


public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

// Tu była figura

        List<Uczestnik> lista = new ArrayList<>();

        lista.add(new Uczestnik("Kornel", 150));
        lista.add(new Uczestnik("Adame", 150));
        lista.add(new Uczestnik("Piotr", 150));
        lista.add(new Uczestnik("Natalia", 150));

//Dalej można na 2 sposoby

        //Wersja skrócona
/*
        for (Uczestnik u :
                lista) {
            u.ustawObecnosc();
            log.info(u.toString());

        }
*/
        //Wersja dłuższa

        for (int i = 0; i <= lista.size(); i++) {
            lista.get(i).ustawObecnosc();
            log.info(lista.get(i).toString());

        }
    }


}


/*
        Figure f1 = new Figure(10, -20);
*/

        /*
        Powinno się używać
        Logger log = Logger.getLogger(Klasa.class.getName());
        log.fine("metoda zakończona");
        log.warning("błąd" + zmienna);
        Zamiast system.out.println
         */
/*
        System.out.println(f1.obliczObwod());
        System.out.println(f1.obliczPole());
        */
