import java.util.Scanner;
public class ArrayDemo2{
   
   public static void main(String[] args){
   
      int ARRAY_SIZE = 5; // Constants
      int[] score = new int[3]; // variable
      
      // Declare an Array variable
      int[] grades;
            
      // Define
      grades = new int[ARRAY_SIZE]; // This is array with size 5
      
      score[0]  = 90;
      
      displayArray(score);
      grades[0] = 80;
      grades[3] = 20;
   
      System.out.println("My score is : " + score);      
      
      displayArray(grades);
   }
   
   private static void displayArray(int[] numbers){
   
      for(int index=0; index < numbers.length ; index++){
         System.out.println ("numbers[" + index + "] = " + numbers[index]);
      }
   
   }
}