import java.util.Scanner;

public class testContinue{
   public static void main (String[]args){
   //declare string type input variable
   //Ask user do you want to print your name again [y/n]
   //if user selects 'y' print the name
   //if user says no end the loop
   
   
   
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