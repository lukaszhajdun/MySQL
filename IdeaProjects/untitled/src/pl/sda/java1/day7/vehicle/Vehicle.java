package pl.sda.java1.day7.vehicle;

public abstract class Vehicle {

    private int wheels;

    protected Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public final int getWheels() {
        return wheels;
    }

    public abstract void ride();

    public abstract void brake();

}
