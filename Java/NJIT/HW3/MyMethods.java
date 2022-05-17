package NJIT.HW3;

public class MyMethods {

   public int surface(double width, double length, double height) {
      double area = (2 * (width * length) + 2 * (length * height) + 2 * (height * width));
      return (int) area;
   }

   public double avgFaceValues(Die object1, Die object2) {
      return ((object1.getFaceValue() + object2.getFaceValue()) / 2.0);
   }
}
