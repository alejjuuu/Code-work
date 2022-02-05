import javax.swing.JOptionPane;
import java.util.Random; 
//import java.util.Scanner;

public class SlotMachine{
	public static void main (String [] args) {
   
      String userStringInput;
      double userMoney;
      Random random = new Random();
      int wordIndex;
      String word = "";
      String outputString = "";
      String word1 = "";
      String word2 = "";
      String word3 = "";
   
      userStringInput = JOptionPane.showInputDialog("How much money do you want to bet?");
      userMoney = Double.parseDouble(userStringInput);
      
      for( int wordCount = 1; wordCount <= 3; wordCount++ ) {
      wordIndex = random.nextInt( 6 );  
      
      if ( wordIndex == 0 ){
      word = "Cherries";
      }
      else if (wordIndex == 1) {
      word = "Oranges";
      }
      else if (wordIndex == 2) {
      word = "Plums";
      }
      else if (wordIndex == 3) {
      word = "Bells";
      }
      else if (wordIndex == 4) {
      word = "Melons";
      }
      else if (wordIndex == 5) {
      word = "Bars";
      }
      
      if( wordCount == 1){
         word1 = word;
      }
      else if(wordCount == 2){
         word2 = word;
      }
      else if(wordCount == 3){
         word3 = word;
      }
 
      // word 1  word2  word3
      if((word1 != word2) && (word1 != word3) && (word2 != word3)) {
         outputString = outputString + "\nYou have won $0";
       }
       outputString += "[ " + word1 + " ]   [ " + word2 + " ]   [ " + word3 + " ]";
       
       JOptionPane.showMessageDialog( null, outputString );
       
       System.exit( 0 );
       
   
      }
      }
   }
   
   
   /*
   
    
  int answer, guess; 
  int MAX = 10;
  int count = 1;

   Scanner keyboard = new Scanner(System.in);
   Random rand = new Random();
   
   answer = rand.nextInt(MAX) + 1;
   
   System.out.println("Guess a number between 1 and 10:");
   guess = keyboard.nextInt();
   

   while (answer != guess){
  

        
   if(guess < answer){
      System.out.println("Sorry too low, try again :( ");
      }
   
   if(guess > answer){
      System.out.println("Sorry, too high, try again :( ");
      }
      
   
   count++;
   
   System.out.println("Guess a number between 1 and 10:");
   guess = keyboard.nextInt();
   }
    if(guess == answer){
      System.out.println("Congratulations " + answer + " was the answer!");
      System.out.println("you try " + count + " times");
      }

     }
}
*/