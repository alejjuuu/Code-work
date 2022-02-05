
//import java.util.Random; 
import java.util.Scanner;

public class MethodTest {

  public static void main(String[] args) {

    System.out.println("In Main Method");
    String aName = "Luis";
    displayMessage(aName);

    // Get user Input
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter value");
    double b1 = keyboard.nextDouble();

    System.out.println("Enter 2nd value");
    double b2 = keyboard.nextDouble();

    keyboard.nextLine(); // dummy input to clear buffer
    System.out.println("What operation you want");
    System.out.println("Sum (S)");
    System.out.println("Multipy (M)");
    System.out.println("Divide (D)");
    System.out.println("Percentage (p)");
    String operation = keyboard.nextLine();
    char input = operation.charAt(0);
    double returnedValue;

    if (input == 'S' || input == 's') {
      returnedValue = sum(b1, b2);
      System.out.println("Sum of values:" + returnedValue);
    } // sum

    else if (input == 'M' || input == 'm') {
      returnedValue = Multiply(b1, b2);
      System.out.println("Multiplication:" + returnedValue);
    } // Multiply

    else if (input == 'M' || input == 'm') {
      returnedValue = Divide(b1, b2);
      System.out.println("Division:" + returnedValue);
    } // divide

  }

  public static void displayMessage(String myName) {
    System.out.println("Welcome!" + myName);

  }
  // A method that returns a value

  public static double sum(double b1, double b2) {
    double result = b1 + b2;
    return result;

  }

  public static double Multiply(double b1, double b2) {
    double result = b1 * b2;
    return result;
  }

  public static double Divide(double b1, double b2) {
    double result = b1 / b2;
    return result;
  }
}

/*
 * 
 * int answer, guess;
 * int MAX = 10;
 * int count = 1;
 * 
 * Scanner keyboard = new Scanner(System.in);
 * Random rand = new Random();
 * 
 * answer = rand.nextInt(MAX) + 1;
 * 
 * System.out.println("Guess a number between 1 and 10:");
 * guess = keyboard.nextInt();
 * 
 * 
 * while (answer != guess){
 * 
 * 
 * 
 * if(guess < answer){
 * System.out.println("Sorry too low, try again :( ");
 * }
 * 
 * if(guess > answer){
 * System.out.println("Sorry, too high, try again :( ");
 * }
 * 
 * 
 * count++;
 * 
 * System.out.println("Guess a number between 1 and 10:");
 * guess = keyboard.nextInt();
 * }
 * if(guess == answer){
 * System.out.println("Congratulations " + answer + " was the answer!");
 * System.out.println("you try " + count + " times");
 * }
 * 
 * }
 * }
 */
