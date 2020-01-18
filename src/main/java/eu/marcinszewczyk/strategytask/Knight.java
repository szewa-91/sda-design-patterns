package eu.marcinszewczyk.strategytask;

public class Knight extends Soldier {
    public Knight(AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        super(attackStrategy, defendStrategy);
    }

    @Override
    public void scream() {
        System.out.println("Bogurodzica...");
    }
}
