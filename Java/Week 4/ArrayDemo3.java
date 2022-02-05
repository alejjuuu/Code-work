import java.util.Scanner;
public class ArrayDemo3{

   public static void main(String[] args){
   
   final int ARRAY_SIZE = 5; //CONSTANTS
   int score;//VARIABLE
   
   //declare an array variable 
   
   int[] grades;
   String[] names;
   
   grades = new int[ARRAY_SIZE]; //this is array with size 5 
   
   score = 90;
   grades[0] =  72;
   grades[1] =  85;
   grades[2] =  81;
   grades[3] =  94;
   grades[4] =  99;
   
   System.out.println("My score is: " + score);
   
   displayArray(grades);
   }
   
   
   private static void displayArray(int[] numbers){
   
   for(int index=0; index <numbers.length ; index++){
      System.out.println ("numbers[" + index + "] = " + numbers[index]);
    
        }
      }   
   
   
   
   
  }
