package Builder;

import java.util.ArrayList;
import java.util.List;

class Meal {
    private String base;
    private String protein;
    private List<String> toppings;
    private String sauce;

    public Meal(String base, String protein, List<String> toppings, String sauce) {
        this.base = base;
        this.protein = protein;
        this.toppings = toppings;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Biryani with " + base + " + " + protein + ", Toppings: " + toppings + ", Sauce: " + sauce;
    }
}

class MealBuilder {
    private String base;
    private String protein;
    private List<String> toppings = new ArrayList<>();
    private String sauce;

    public MealBuilder setBase(String base) {
        this.base = base;
        return this;
    }

    public MealBuilder setProtein(String protein) {
        this.protein = protein;
        return this;
    }

    public MealBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public MealBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Meal build() {
        return new Meal(base, protein, toppings, sauce);
    }
}

public class Main {
    public static void main(String[] args) {
        Meal biryani = new MealBuilder()
                .setBase("Basmati Rice")
                .setProtein("Marinated Chicken")
                .addTopping("Fried Onions")
                .addTopping("Mint Leaves")
                .addTopping("Boiled Eggs")
                .setSauce("Raita")
                .build();

        System.out.println(biryani);
    }
}

