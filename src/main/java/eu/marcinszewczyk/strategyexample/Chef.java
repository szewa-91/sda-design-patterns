package eu.marcinszewczyk.strategyexample;

public class Chef {
    private BoilingEggStrategy boilingEggStrategy;
    private String name;

    public Chef(String name, BoilingEggStrategy boilingEggStrategy) {
        this.name = name;
        this.boilingEggStrategy = boilingEggStrategy;
    }

    public void cook(){
        System.out.println(name + " nastawia wodę");
        boilingEggStrategy.boilEgg();
        System.out.println(name + " serwuje jajko gościom");
    }
}
