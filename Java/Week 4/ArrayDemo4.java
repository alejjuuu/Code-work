import java.util.Scanner;
public class ArrayDemo4{
   
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int arraySize = 0;
      int sum = 0;

      /* STEP 1 - We will ask user to enter the size of the array */
      System.out.println("How many students grade do you want to enter? " );
      arraySize = keyboard.nextInt();
      
      int[] grades = new int[arraySize];
      
      for (int index=0; index < arraySize; index++){
      
         System.out.print("Enter student " + (index+1) + "  grade : "); 
         grades[index] = keyboard.nextInt();
         
      }      
      
         for (int i=0; i<arraySize; i++){
        	sum  = sum + grades[i];
        }      
           
      
      
      // then fill 
      displayArray(grades);
      
      // Calculate and Display the Class Average
      // Add up all the students score and divide it by number of students.
      // display the result (Average).




             double average = sum / arraySize;    
      System.out.format("The average is: %.3f", average);
   }
   
   private static void displayArray(int[] numbers){
   
      for(int index=0; index < numbers.length ; index++){
         System.out.println ("Student[" + index + "] = " + numbers[index]);
      }
   
   }
}