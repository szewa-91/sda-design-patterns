package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.sauces.Sauce;
import eu.marcinszewczyk.factoryexample.sauces.SweetAndSourSauce;

public class SweetAndSourFoodFactory extends ChineeseFoodFactory {

    public static final String DESCRIPTION = "smażony";
    public static final SweetAndSourSauce SAUCE = new SweetAndSourSauce();

    @Override
    Sauce getSauce() {
        return new SweetAndSourSauce();
    }

    @Override
    String getDescription() {
        return DESCRIPTION;
    }
}
