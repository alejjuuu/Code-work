package others;

import java.util.Scanner;

public class Addloop {
   public static void main(String[] args) {

      int sum = 0;
      int user;
      int numb = 1;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter the number you would like to be add up: ");
      user = keyboard.nextInt();

      if (user > 0) {

         // while the statement is true it will keep running and adding each number until
         // reach the number given by the user.
         while (numb <= user) {
            sum += numb;
            numb++;

         }

         System.out.println("The sum of your number from 1 to " + user + " is " + sum);
      } else
         System.out.println("Please enter a number higer than 0 ");

   }
}