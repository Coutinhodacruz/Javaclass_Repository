package Human;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.sleep();
        human.walk();
        NativeGee nativeGee = new NativeGee();

        nativeGee.learnJava();
        System.out.println();
        nativeGee.learnPython();
    }
}
