package NJIT.HW1;

//********************************************************************
//  UnitConverter.java       
//
//  Convert inches to feet
//********************************************************************

import java.util.Scanner;

public class UnitConverter {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      // initial values for first
      double inchesFeet = 12;
      System.out.println("Enter the number of inches to convert to feet: ");
      // prints the message and stores the value in the set variables
      int inches = scan.nextInt();
      // used float to get decimals and made the math with the users input
      double feet = (double) (inches / inchesFeet);
      System.out.println(inches + " inches, is equal to " + feet + " feet.");
      scan.close();

   }
}