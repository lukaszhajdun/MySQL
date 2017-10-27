package Zadanie;

/**
 * Created by Esiu on 2017-07-16.
 */
public abstract class Animal {

    public static boolean nam;
    static String name = new String("Gucio");

    static String speak = new String("RRRRRRRRRRRR");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (!name.equals(animal.name)) return false;
        return speak.equals(animal.speak);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + speak.hashCode();
        return result;
    }
}


