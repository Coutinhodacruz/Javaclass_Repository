package Zoo;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.makeSound());
        Dog dog = new Dog();
        dog.bite();
        System.out.println(dog.makeSound());


    }
}
