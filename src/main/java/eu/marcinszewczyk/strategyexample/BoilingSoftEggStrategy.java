package eu.marcinszewczyk.strategyexample;

public class BoilingSoftEggStrategy implements BoilingEggStrategy {
    @Override
    public void boilEgg() {
        System.out.println(" gotuje jajka na miękko");
    }
}
