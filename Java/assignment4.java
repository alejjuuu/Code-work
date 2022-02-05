import java.util.Scanner;
import java.util.Random;

public class assignment4{
   public static void main (String[]args){
   Scanner keyboard = new Scanner(System.in);
  
  //Part 1 - sum of numbers 
  //part 2 - Random number gussing game
   Random rnd = new Random();
   int number;
   int userGuess;
   number = rnd.nextInt(10);
  System.out.println(" Do you want to print your name?");
   
   
   if (userGuess > number){ 
    System.out.println(" your guess is too high");
    
   else if (userGuess < number){ 
    System.out.println(" your guess is too low");
    
    else{
    System.out.println("You guessed the number");
    break;
    
    
   
    System.out.println(" ");
   
   String input;
   char answer='y';
   Scanner keyboard = new Scanner (System.in);
   while (answer == 'y' || answer == 'y'){
   
      System.out.println(" Do you want to print your name?");
		System.out.print("[Y/N]");
		input = keyboard.nextLine();
      answer = input.charAt(0);
		
      
      }
      
    }
    }