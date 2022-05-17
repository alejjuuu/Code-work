package NJIT.HW1.HW1;

//********************************************************************
//  UnitConverter.java       
//
//  
//********************************************************************
import java.util.Scanner;

public class UnitConvertion {
   // -----------------------------------------------------------------
   //
   // -----------------------------------------------------------------
   public static void main(String[] args) {
      // initial values for first, second problems **not used**
      double inches_feet = 12, pound_gram = 453.592;
      // scanner to get the input from the user
      Scanner scan = new Scanner(System.in);
      // boolean for an infinite loop
      boolean end_program = false;
      // while loop to make the program infinite
      while (end_program == false) {
         System.out.println("Choose the convertion you wished to do, you have three choices");
         System.out.println("-------------------------\n");
         System.out.println("1 - Convert from inches to feet");
         System.out.println("2 - Convert from grams to pounds");
         System.out.println("3 - Convert miligrams to kilograms, grams and milligrams");
         System.out.println("4 - Quit");
         // variable choice to read the choice from the user from the menu printed
         int choice = scan.nextInt();
         // used a switch statement inside the infite loop to give the user the choices
         // they want from the menu
         switch (choice) {
            case 1:
               System.out.println("Enter the number of inches: ");
               // prints the message and stores the value in the set variables
               int inches = scan.nextInt();
               // used float to get decimals and made the math with the users input
               float total_inches = (float) (inches / inches_feet);
               System.out.println("The number of inches is: " + (Math.round(total_inches)));
               break;
            case 2:
               System.out.print("Enter the number of grams: ");
               float grams = scan.nextFloat();
               // used float to get decimals and made the math with the users input
               float total_grams = (float) (grams / pound_gram);
               System.out.println("The number of pounds is: " + total_grams);
               break;
            case 3:
               System.out.print("Enter the number of: ");
               int milligrams = scan.nextInt();
               // if milligrams < 1000000 it won't print any value
               int final_kilograms = (milligrams / 1000000);
               // if there were kilograms, get them back by multiplying * 1000000 and substract
               // the number of kilograms from the initial value, divide the result value by
               // thousand
               int final_grams = ((milligrams - (final_kilograms * 1000000)) / 1000);
               // if there were killograms and grams substract them from the initial value from
               // the user to obtain milligrams
               // obtain kilograms and grams by multiplying by each correspoding value with
               // their set of 0s
               int final_milligrams = milligrams - ((final_kilograms * 1000000) + (final_grams * 1000));
               System.out.println(milligrams + " milligrams are equivalent to " + final_kilograms + " kilogram, "
                     + final_grams + " grams " + ", and " + final_milligrams + " milligrams");
               break;
            case 4:
               // if user choice is 4, it closes the scanner, kicks the user out of the loop
               // and makes the while boolean become false
               scan.close();
               end_program = true;
               System.out.print("Goodbye!");
               break;
         }
      }
   }
}
