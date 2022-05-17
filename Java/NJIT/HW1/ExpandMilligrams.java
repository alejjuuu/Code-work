package NJIT.HW1;

//********************************************************************
//  ExpandMilligrams.java       
//
//  Converst miligrams in kilograms and grams and milligrams
//********************************************************************

import java.util.Scanner;

public class ExpandMilligrams {

      public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print(
                        "Enter the number of miligrams to see how many kilograms, grams and milligrams it contains: ");
            int milligrams = scan.nextInt();
            // if milligrams < 1000000 it won't print any value
            int kilograms = (milligrams / 1000000);
            // if there were kilograms, get them back by multiplying * 1000000 and substract
            // the number of kilograms from the initial value, divide the result value by
            // thousand
            int grams = ((milligrams - (kilograms * 1000000)) / 1000);
            // if there were killograms and grams substract them from the initial value from
            // the user to obtain milligrams
            // obtain kilograms and grams by multiplying by each correspoding value with
            // their set of 0s
            int finalMilligrams = milligrams - ((kilograms * 1000000) + (grams * 1000));
            System.out.println(milligrams + " milligrams are equivalent to " + kilograms + " kilogram, "
                        + grams + " grams " + ", and " + finalMilligrams + " milligrams");
            scan.close();
      }
}