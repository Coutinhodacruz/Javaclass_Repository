package tdd;

public class PetrolPurchase {
    private String Name;
    private String location;
    private String PetrolType;
    private double Quantity;

    private double pricePerLiter;


    public PetrolPurchase(String name, String location, String petrolType, int quantity, double pricePerLiter) {
        this.Name = name;
        this.PetrolType = petrolType;
        this.location = location;
        this.Quantity = quantity;
        this.pricePerLiter = pricePerLiter;
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

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setPricePerLiter(int pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getQuantity() {
        return Quantity;

    }
    public void Purchase() {
        switch (getName()) {
            case "Toyota Filling Station":
                break;
            default:
                System.out.println();
        }
    }
}
