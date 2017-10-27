package pl.sda.java1.day7.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> list = new ArrayList<>();

        list.add(new Bicycle());
        list.add(new Motorbike());
        list.add(new Car());

        for (Vehicle v : list) {

            System.out.println(v.getClass().getSimpleName() + ": ");
            v.ride();
            v.brake();


        }


//        Vehicle v1 = new Bicycle();
//        v1.ride();
//        v1.brake();
//        System.out.println("Wheels: " + v1.getWheels());
//
//        System.out.println("\nMotorbike1: ");
//        Vehicle v2 = new Motorbike();
//        v2.ride();
//        v2.brake();
//        System.out.println("\nMotorbike2: ");
//        HasEngine h1 = new Motorbike();
//        h1.startEngine();
//        h1.stopEngine();
//
//        System.out.println("\nCar1: ");
//        Vehicle v3 = new Car();
//        v3.ride();
//        v3.brake();
//        System.out.println("\nCar2: ");
//        HasEngine h2 = new Car();
//        h2.startEngine();
//        h2.stopEngine();
//
//        System.out.println("\nCar3: ");
//        Car c3 = new Car();
//        c3.ride();
//        c3.brake();

    }
}
