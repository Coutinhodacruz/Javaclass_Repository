package polymorphism;

public class ItalianChef extends Chef {

    public ItalianChef(String firstName, int phoneNumber) {
        super(firstName, phoneNumber);
    }

    public void makeChicken(){
        System.out.println("The chef makes a delicious chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes healthy salad");
    }

    public void makeSpecialDish(){
        System.out.println("The chef cooks orange chicken");
    }

    public void makesPasta(){
        System.out.println("Italian chef makes delicious pasta");
    }

}
