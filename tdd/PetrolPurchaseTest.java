package tdd;

class PetrolPurchaseTest {


    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Toyota filling station","Charity oshodi","Fuel",100,129.290);

        System.out.println(petrolPurchase.getName());
        System.out.println(petrolPurchase.getLocation());
        System.out.println(petrolPurchase.getPetrolType());
        System.out.println(petrolPurchase.getQuantity());
        System.out.println(petrolPurchase.getPricePerLiter());

        System.out.print(petrolPurchase.Purchase(6, 190.08));


    }

}