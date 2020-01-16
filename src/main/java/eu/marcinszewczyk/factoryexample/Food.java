package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Addition;
import eu.marcinszewczyk.factoryexample.sauces.Sauce;

public abstract class Food {
    private Sauce sauce;
    private Addition addition;
    private FoodSize size;
    private String additionalDescription;
    private int calories;

    public Food(Sauce sauce, Addition addition, FoodSize size, String additionalDescription, int calories) {
        this.sauce = sauce;
        this.addition = addition;
        this.size = size;
        this.additionalDescription = additionalDescription;
        this.calories = calories;
    }

    public String getDescription() {
        return size.getDescription()
                + ", "
                + additionalDescription
                + " "
                + getBaseDescription()
                + ", "
                + addition.getDescription()
                + ", "
                + sauce.getDescription()
                + "; kaloryczność: "
                + calories;
    }

    public abstract String getBaseDescription();
}
