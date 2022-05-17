package NJIT.HW3;

public class Dog {
   private String name;
   private double pounds;

   // Constructor
   public Dog() {

      name = "dog";
      pounds = 0;
   }

   public void setDogName(String dogName) {
      name = dogName;
   }

   public void setDogWeight(Double dogWeight) {
      pounds = dogWeight;
   }

   public String getDogName() {
      return name;
   }

   public double getDogWeight() {
      return pounds;
   }

   public double toKgs() {
      return (pounds * 0.453592);
   }

   public String toString() {
      return "Dog named " + name + " weights " + pounds + " pounds";
   }
}