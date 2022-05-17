package others;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayAssignment {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int arraySize = 0;
    int sum = 0;

    System.out.println("How many tests have you had so far? ");
    arraySize = keyboard.nextInt();

    int[] grades = new int[arraySize];

    for (int index = 0; index < arraySize; index++) {

      System.out.print("Enter test score " + (index + 1) + " : ");
      grades[index] = keyboard.nextInt();

    }
    displayArray(grades);
  }

  private static void displayArray(int[] numbers) {

    for (int index = 0; index < numbers.length; index++) {

      System.out.print("Here are the scores" + numbers[index]);

    }
  }
}