package pl.sda.java1.day5;

import java.util.Random;

public class Array {
    private double[] array;
    private double avg;

    public Array(int n) {
        this.array = new double[n];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble() * 100;
        }
    }

    public void print() {
        for (double v : array) {
            System.out.print(String.format("%3.2f  ", v));
        }
        System.out.println();
    }

    public void printMinAndMax() {
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        for (double v : array) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }

        System.out.println(String.format("min: %3.2f, max: %3.2f", min, max));
    }

    public void printAvg() {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        avg = sum / array.length;
        System.out.println(String.format("avg: %3.2f", avg));
    }

    public void printQuartiels() {

        System.out.print("less than avg: ");
        int i = 0;
        while (i < array.length) {
            if (array[i] < avg) {
                System.out.print(String.format("%3.2f  ", array[i]));
            }
            i++;
        }
        System.out.println();

        System.out.print("grea than avg: ");
        i = 0;
        while (i < array.length) {
            if (array[i] >= avg) {
                System.out.print(String.format("%3.2f  ", array[i]));
            }
            i++;
        }

    }

    public static void main(String[] args) {
        Array arr = new Array(5);

        arr.print();
        arr.printMinAndMax();
        arr.printAvg();
        arr.printQuartiels();
    }

}
