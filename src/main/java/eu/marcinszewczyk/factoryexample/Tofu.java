package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Addition;
import eu.marcinszewczyk.factoryexample.sauces.Sauce;

public class Tofu extends Food {
    public Tofu(Sauce sauce, Addition addition, FoodSize size, String additionalDescription, int calories) {
        super(sauce, addition, size, additionalDescription, calories);
    }

    @Override
    public String getBaseDescription() {
        return "tofu";
    }
}
