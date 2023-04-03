package dependencyInjetction.strategy;

public class QuackTwo implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack for two");
    }
}
