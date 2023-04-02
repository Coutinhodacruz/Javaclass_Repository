package polymorphism;

public class ChinaChef extends Chef {

    public ChinaChef(String firstName, int phoneNumber) {
        super(firstName, phoneNumber);
    }

    public void  makeFriedRice(){
        System.out.println("the makes fried rice");
    }


}
