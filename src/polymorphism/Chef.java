package polymorphism;

public class Chef {

    String firstName;

    public Chef(String firstName, int phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void makeChicken(){
        System.out.println("The chef makes a delicious chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes healthy salad");
    }

    public void makeSpecialDish(){
        System.out.println("The chef cooks bbq ribs");
    }

}
