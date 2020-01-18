package eu.marcinszewczyk.strategyexample;

public class MainAppStrategy {

    public static void main(String[] args) {

        BoilingMediumEggStrategy boilingMediumEggStrategy =
                new BoilingMediumEggStrategy();
        BoilingSoftEggStrategy boilingSoftEggStrategy =
                new BoilingSoftEggStrategy();
        Chef hardChef = new Chef("Gordon Gessler", boilingMediumEggStrategy);
        Chef softChef = new Chef("Podest Amaro", boilingSoftEggStrategy);

        hardChef.cook();
        softChef.cook();
    }
}
