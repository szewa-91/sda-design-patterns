package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Addition;
import eu.marcinszewczyk.factoryexample.sauces.Sauce;

public abstract class ChineeseFoodFactory {
    Food chicken(FoodSize size, Addition addition) {
        return new Chicken(
                getSauce(),
                addition,
                size,
                getDescription(),
                650);
    }
    Food pork(FoodSize size, Addition addition) {
        return new Pork(
                getSauce(),
                addition,
                size,
                getDescription(),
                650);
    };

    abstract Sauce getSauce();
    abstract String getDescription();
}
