package eu.marcinszewczyk.strategytask;

public class Ninja extends Soldier {
    public Ninja(AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        super(attackStrategy, defendStrategy);
    }

    @Override
    public void scream() {
        System.out.println("Banzaj!");
    }
}
