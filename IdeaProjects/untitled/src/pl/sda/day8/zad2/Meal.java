package pl.sda.day8.zad2;

import java.util.HashSet;

/**
 * Created by RENT on 2017-07-06.
 */
public class Meal {
    private HashSet<Ingredient> meal = new HashSet<>();

    public void addIngridient(Ingredient ingredient) {
        meal.add(ingredient);
    }

    public void removeIngridient(Ingredient ingredient) {
        meal.remove(ingredient);
    }

    public void printIngridients() {
        for (Ingredient ingredient : meal) {
            System.out.println(ingredient);

        }

    }

    public HashSet<Ingredient> getIngridients() {
        return meal;
    }
}
