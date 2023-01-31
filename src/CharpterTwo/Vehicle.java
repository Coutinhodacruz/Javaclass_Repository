package CharpterTwo;

public class Vehicle {

   private int year;
   private String model;
   private String colour;
   private double price;


   public Vehicle(String model, int year, double price, String colour){
      this.model = model;
      this.year = year;
      this.price = price;
      this.colour = colour;

   }

   public int getYear() {
      return year;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setYear(int year) {
      this.year = year;
   }
   public void printDetails(){
      System.out.println("Vehicle Model: " + model);
      System.out.println("Vehicle Year: " + year);
      System.out.println("Vehicle Price: " + price);
      System.out.println("Vehicle Colour: " + colour);
   }

}
