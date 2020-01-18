package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.sauces.Sauce;
import eu.marcinszewczyk.factoryexample.sauces.SpicySauce;

public class SpicyFoodFactory extends ChineeseFoodFactory {

    public static final String DESCRIPTION = "grillowana";
    public static final SpicySauce SAUCE = new SpicySauce();

    @Override
    Sauce getSauce() {
        return SAUCE;
    }

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
