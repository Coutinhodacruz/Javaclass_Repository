package dependencyInjetction.strategy;

public class Duck {

    private Flyable myFly;

    public Duck(Flyable myFly, Quackable myQuack) {
        this.myFly = myFly;
        this.myQuack = myQuack;
    }

    public Flyable getMyFly() {
        return myFly;
    }

    public void setMyFly(Flyable myFly) {
        this.myFly = myFly;
    }

    public Quackable getMyQuack() {
        return myQuack;
    }

    public void setMyQuack(Quackable myQuack) {
        this.myQuack = myQuack;
    }

    private Quackable myQuack;


    public void fly(){
        myFly.fly();

    }
    public void quack(){
        myQuack.quack();

    }
}
