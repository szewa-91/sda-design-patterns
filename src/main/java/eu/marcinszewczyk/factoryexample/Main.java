package eu.marcinszewczyk.factoryexample;

import eu.marcinszewczyk.factoryexample.addition.Pasta;
import eu.marcinszewczyk.factoryexample.addition.Rice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witamy w chińskiej restauracji! Klient nasz pan!");

        ChineeseFoodFactory sweetAndSourFoodFactory = new SweetAndSourFoodFactory();
        ChineeseFoodFactory spicyFoodFactory2 = new SpicyFoodFactory();

        Food food = sweetAndSourFoodFactory
                .chicken(FoodSize.SMALL, new Rice());

        Food food1 = spicyFoodFactory2.pork(FoodSize.SMALL, new Pasta());
        Food food2 = sweetAndSourFoodFactory.chicken(FoodSize.XXL, new Pasta());

        System.out.println(food.getDescription());
        System.out.println(food1.getDescription());
        System.out.println(food2.getDescription());
    }

}
