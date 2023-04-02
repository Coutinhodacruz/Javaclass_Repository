package dependencyInjetction.strategy;

public class DuckGame {
    public static void main(String[] args) {
        FlyZero flyZero = new FlyZero();
        QuackOne quackOne = new QuackOne();
        Duck mDuck = new Duck(flyZero, quackOne);

        mDuck.fly();

    }
}
