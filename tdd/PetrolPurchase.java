package tdd;

public class PetrolPurchase {
    private String Name;
    private String location;
    private String PetrolType;

   // private int Quantity;


    public PetrolPurchase() {
    }

    public void setName(String name) {

        this. Name = name;
    }
    public String getName() {

        return Name;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getLocation() {

        return location;
    }

    public void setPetrolType(String PetrolType) {

        this.PetrolType = PetrolType;
    }

    public String getPetrolType(){

        return PetrolType;
    }

//    public void setQuantity(int quantity, int i) {
//     this.Quantity = quantity;
//    }
//
//    public int getQuantity(){
//        return Quantity;
//    }

}