package eu.marcinszewczyk.strategyexample;

public class BoilingMediumEggStrategy implements BoilingEggStrategy {
    @Override
    public void boilEgg() {
        System.out.println("Gotuje jajko takie se");
    }
}
