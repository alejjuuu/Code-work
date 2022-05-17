package NJIT.HW2;

//********************************************************************
//  NameApp.java       
//
//  Creates a random user name with the user first name and last name
//********************************************************************
import java.util.*;

public class NameApp {

   public static void main(String[] args) {
      Random generator = new Random();
      int ranInt = generator.nextInt(50) + 1;

      Scanner scan = new Scanner(System.in);

      System.out.println("What's your first name: ");
      String firstName = scan.next();
      System.out.println("What's your last name: ");
      String lastName = scan.next();

      // String firstName = "luis";
      char last = lastName.charAt(0);
      String first = firstName.substring(0, 3);

      // String first = lastName.substring(lastName.length() - 3); last three letters
      // System.out.println("The fisrt letter of the first name is \n" + first + "\n
      // and the second is \n" + last); // they asked only for the first and last name
      // not any intro
      System.out.println(last + first + ranInt);
      scan.close();
   }

}