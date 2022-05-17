package NJIT.HW3;

import java.util.*;

public class TestMethods {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      MyMethods method1 = new MyMethods();

      System.out.println("Enter width: ");
      double width = scan.nextDouble();
      System.out.println("Enter length: ");
      double length = scan.nextDouble();
      System.out.println("Enter height: ");
      double height = scan.nextDouble();

      System.out.println("The total surface area is: " + method1.surface(width, length, height));

      Die die1 = new Die();
      Die die2 = new Die();
      die1.roll();
      die2.roll();
      // die1.getFaceValue();
      // die2.getFaceValue();
      System.out.println("The average of the two dice is: " + method1.avgFaceValues(die1, die2));

   }

}