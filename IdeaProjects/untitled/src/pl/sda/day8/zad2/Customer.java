package pl.sda.day8.zad2;

import java.util.HashSet;

/**
 * Created by RENT on 2017-07-06.
 */
public class Customer {
    private HashSet<Ingredient> allergies = new HashSet<>();

    public void addAlergy(Ingredient allergen) {
        allergies.add(allergen);
    }

    public boolean isDead(Meal meal) {
        for (Ingredient allergen : allergies) {
            if (meal.getIngridients().contains(allergen)) {
                return true;
            }
        }
        return false;
    }
}
