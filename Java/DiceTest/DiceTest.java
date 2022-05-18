package DiceTest;

import java.util.Scanner;
import java.util.Random;

/*
This program simulates the Dice
*/
public class DiceTest {
   public static void main(String[] args) {
      int Dice1;
      int Dice2;

      Random rnd = new Random();

      Dice1 = rnd.nextInt(6) + 1;
      Dice2 = rnd.nextInt(6) + 1;
      if (Dice1 == Dice2) {
         System.out.println("you hit Jackpot, and won $100Million");
      }

      System.out.println(Dice1 + " - " + Dice2);

   }
}