package pl.sda.java1.zadanie2;

import java.util.Random;

/**
 * Created by RENT on 2017-06-28.
 */

public class Exams {

    private float math;                  //Najpierw pola
    private float physics;
    private float polish;

    private static final Random rand = new Random();

    public Exams() { //Konstruktor pusty
    }

    //Konstruktor

    public Exams(float math, float physics, float polish) {

        this.math = math;
        this.physics = physics;
        this.polish = polish;


    }


    public void setMath(float grade) {
        math = grade;
    }

    public void setPhysics(float grade) {
        physics = grade;
    }

    public void setPolish(float grade) {
        polish = grade;
    }

    public float avg() {
        return (math + physics + polish) / 3;

    }

    public boolean passed() {
        return (math > 2) && (physics > 2) && (polish > 2); //Nawiasów nie trzeba w tym prostym przypadku
    }

    public void retestAll() {
        if (math < 3) {
            math = retest();
        }
        if (physics < 3) {
            physics = retest();
        }
        if (polish < 3) {
            polish = retest();
        }
    }

    private float retest() {


        if (rand.nextBoolean()) {
            return 3;
        } else {
            return 2;
        }
    }


    @Override      //prawy przycisk i gereruj
    public String toString() {
        return "Exams{" +
                "math=" + math +
                ", physics=" + physics +
                ", polish=" + polish +
                ", average=" + String.format("%.2f", avg()) +
                ", passed=" + passed() +
                '}';                                                //Zadanie Przepisać to na stringformat
    }
}
