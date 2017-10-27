package pl.sda.java1.day7.vehicle;

public class Motorbike extends Vehicle implements HasEngine {

    private boolean engineRunning;

    public Motorbike() {
        super(2);
    }

    @Override
    public void ride() {
        startEngine();
        System.out.println("I ride motorbike");
    }

    @Override
    public void brake() {
        System.out.println("I brake motorbike");
        stopEngine();
    }

    @Override
    public void stopEngine() {
        if (engineRunning)
            engineRunning = false;
        System.out.println("I stop engine");
    }

    @Override
    public void startEngine() {
        if (!engineRunning)
            engineRunning = true;
        System.out.println("I start engine");


    }
}
