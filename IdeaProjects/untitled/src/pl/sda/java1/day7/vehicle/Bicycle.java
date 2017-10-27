package pl.sda.java1.day7.vehicle;

public class Bicycle extends Vehicle {

    public Bicycle() {
        super(2);
    }


    @Override
    public void ride() {
        System.out.println("I ride bicycle");
    }

    @Override
    public void brake() {
        System.out.println("I brake my bicycle");
    }
}
