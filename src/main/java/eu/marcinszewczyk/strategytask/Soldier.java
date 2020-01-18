package eu.marcinszewczyk.strategytask;

public abstract class Soldier {
    AttackStrategy attackStrategy;
    DefendStrategy defendStrategy;
    int attackStrength;

    public Soldier(AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public abstract void scream();

    public void attack() {
        attackStrategy.attack();
    };
    public void defend() {
        defendStrategy.defend();
    };

}
