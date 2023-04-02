package dependencyInjetction.strategy;

public class QuackZero implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack for Zero");
    }
}
