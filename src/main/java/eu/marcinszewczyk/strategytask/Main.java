package eu.marcinszewczyk.strategytask;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Ninja(new CautiousAttackStrategy(), new ObronaCzestochowy());
        Soldier soldier2 = new Knight(new CautiousAttackStrategy(), new AggresiveDefendStrategy());

        soldier1.scream();
        soldier1.attack();

        soldier2.scream();
        soldier2.defend();
    }
}
