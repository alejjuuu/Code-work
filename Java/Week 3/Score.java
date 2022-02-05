
import java.util.Scanner;
public class Score 
{ 
   public static void main(String[]args)
   {
      int testScore;
      
      //Create a scanner object for keyborad input. 
      Scanner keyboard = new Scanner (System.in);
      
      //Get a test score.
      System.out.print("Enter your test score:");
      testScore = keyboard.nextInt();
      
      if (testScore) >=0 && testScore <=50){ // = AND 
       System.out.println("Fail");
       }
       else if (testScore >=51 && testScore <=60){
        System.out.println("D");
        }
         else if (testScore >=61 && testScore <=70){
        System.out.println("C");
        }
        else if (testScore >=71 && testScore <=80){
        System.out.println("B"); 
        }
        else if (testScore >=81 && testScore <=90){
        System.out.println("A");
        }
        else if (testScore >=91 && testScore <=100){
        System.out.println("A+");
        }
        else (testScore >=81 && testScore <=90){
        System.out.println("D");
      
         // Was the score a good one?
         if (testScore> 90)
         {
            System.out.println("That's a great score!");
            System.out.println("Keep up the Good Work");
            }
            else {
             System.out.println("Work Hard!");
             
          }
      }
  }
         