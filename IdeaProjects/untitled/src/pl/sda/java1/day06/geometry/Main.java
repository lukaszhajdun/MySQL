package pl.sda.java1.day06.geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();

        list.add(new Circle(4));
        list.add(new Parallelogram(3, 4, 2));
        list.add(new Rectangle(3, 4));
        list.add(new Trapeze(3, 4, 2));

        for (Figure f : list) {
            System.out.println(f + "agra" + f.getArea() + "per" + f.getPerimeter());
        }


    }
}
