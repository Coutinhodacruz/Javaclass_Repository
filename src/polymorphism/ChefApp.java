package polymorphism;

public class ChefApp {

    public static void main(String[] args) {

        ItalianChef italianChef = new ItalianChef("Coutinho", 1);
        Chef chef = new Chef("dacruz",2);
        ChinaChef chinaChef = new ChinaChef("Bobby",3);
        italianChef.makeSpecialDish();
        chef.makeChicken();
        chinaChef.makeFriedRice();



    }
}
