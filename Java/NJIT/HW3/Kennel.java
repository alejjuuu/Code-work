package NJIT.HW3;

import java.util.*;

public class Kennel {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double avg;
      Dog dog1;
      Dog dog2;
      dog1 = new Dog();
      dog2 = new Dog();
      System.out.println("What the name of the two dogs? (Please leave a space with between names) ");
      String name1 = scan.next();
      String name2 = scan.next();
      dog1.setDogName(name1);
      dog2.setDogName(name2);
      System.out.println("What the weight in pounds of the two dogs? (Please leave a space with between weights) ");
      double weigth1 = scan.nextDouble();
      double weigth2 = scan.nextDouble();
      dog1.setDogWeight(weigth1);
      dog2.setDogWeight(weigth2);
      avg = ((dog1.toKgs() + dog2.toKgs()) / 2.0);
      System.out.println(dog1.toString());
      System.out.println(dog2.toString());
      System.out.println("The total average of the two dogs is: " + avg);
      dog1.getDogName();

   }
}