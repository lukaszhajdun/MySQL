package pl.sda.java1.day06.geometry;

public class Rectangle extends Parallelogram {

    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    @Override
    public String toString() {
        return "Rectangle{a=" + a + ", b=" + h + "}";
    }
}
