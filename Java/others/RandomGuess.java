package others;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

   public static void main(String[] args) {
      int answer, guess;
      int MAX = 10;
      int count = 1;

      Scanner keyboard = new Scanner(System.in);
      Random rand = new Random();

      answer = rand.nextInt(MAX) + 1;

      System.out.println("Guess a number between 1 and 10:");
      guess = keyboard.nextInt();

      while (answer != guess) {

         if (guess < answer) {
            System.out.println("Sorry too low, try again :( ");
         }

         if (guess > answer) {
            System.out.println("Sorry, too high, try again :( ");
         }

         count++;

         System.out.println("Guess a number between 1 and 10:");
         guess = keyboard.nextInt();
      }
      if (guess == answer) {
         System.out.println("Congratulations " + answer + " was the answer!");
         System.out.println("you try " + count + " times");
      }

   }
}
