package NJIT.HW1;

//********************************************************************
//  GramsToPounds.java       
//
//  Convert grams to pounds
//********************************************************************

import java.util.Scanner;

public class GramsToPounds {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      // initial values for first
      double poundGram = 453.592;
      System.out.print("Enter the number of grams to conver to pounds: ");
      float grams = scan.nextFloat();
      // used float to get decimals and made the math with the users input
      float pounds = (float) (grams / poundGram);
      System.out.println(grams + " grams, is equal to " + pounds + " pounds.");
      scan.close();
   }
}