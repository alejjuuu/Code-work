package SumofNumber;

import java.util.Scanner;
import java.util.Random;

public class SumOfNumber {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int userNumber = -1;
            int sum = 0;

            while (userNumber < 1) {
                  System.out.println("Please enter a positive number: ");
                  userNumber = scanner.nextInt();
            }
            for (int number = 1; number <= userNumber; number++) {
                  sum = sum + number;
            }
            System.out.println("The sum of numbers from 1 to " + userNumber + " is " + sum);

      }
}
