package dependencyInjetction.strategy;

public class QuackOne implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack for one");
    }
}
