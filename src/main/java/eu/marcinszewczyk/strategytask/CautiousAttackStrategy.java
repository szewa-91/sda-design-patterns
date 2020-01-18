package eu.marcinszewczyk.strategytask;

public class CautiousAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Ostrozny atak");
    }
}
