package eu.marcinszewczyk.strategytask;

public class AggresiveDefendStrategy implements DefendStrategy {
    @Override
    public void defend() {
        System.out.println("Walczymy jak lwy");
    }
}
