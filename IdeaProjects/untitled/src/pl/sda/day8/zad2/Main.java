package pl.sda.day8.zad2;

/**
 * Created by RENT on 2017-07-06.
 */
public class Main {
    public static void main(String[] args) {
        Ingredient cheese = new Ingredient("cheese");
        Ingredient ham = new Ingredient("ham");
        Ingredient tomato = new Ingredient("tomato");
        Ingredient bread = new Ingredient("bread");

        Meal sandwich = new Meal();
        sandwich.addIngridient(cheese);
        sandwich.addIngridient(ham);
        sandwich.addIngridient(tomato);
        sandwich.addIngridient(bread);

        sandwich.printIngridients();

        Customer julian = new Customer();
        julian.addAlergy(tomato);
        System.out.println(julian.isDead(sandwich));
    }
}
