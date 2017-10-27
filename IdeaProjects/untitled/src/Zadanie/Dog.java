package Zadanie;

/**
 * Created by Esiu on 2017-07-16.
 */
public class Dog extends Animal {

        public static String name = new String("Pies");

        static String speak = new String("Hau Hau");

        public Dog(String speak) {
                this.speak = speak;
        }


        @Override
        public String toString() {
                return super.toString();
        }
}
