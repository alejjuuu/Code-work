import java.util.Random; 
import java.util.Scanner;

public class RandomNumber{

	public static void main (String [] args){
    
  int answer, guess; 
  final int MAX = 10;

   Scanner keyboard = new Scanner(System.in);
   Random rand = new Random();
   
   answer = rand.nextInt(MAX) + 1;
   
   System.out.println("Guess a number between 1 and 10:");
   guess = keyboard.nextInt();
   
   if(guess == answer){
      System.out.println("Congratulations " + answer + " was the answer!");
      }
     
   if(guess < answer){
      System.out.println("Sorry too low, try again " + answer);
      }
   
   if(guess > answer){
      System.out.println("Sorry, too high, try again " + answer);
      }
   
   
     }
}
