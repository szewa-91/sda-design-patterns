package eu.marcinszewczyk.strategyexample;

public class BoilingHardEggStrategy implements BoilingEggStrategy {
    @Override
    public void boilEgg() {
        System.out.println(" gotuje jajka na twardo");
    }
}
