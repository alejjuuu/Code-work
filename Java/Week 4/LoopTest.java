 import java.util.Scanner;
import java.text.DecimalFormat;

public class LoopTest
{
	public static void main (String [] args)
	{ 
  int times = 1; 
  int tableOf = 2;
  int answer;
  
  while(times <= 39){
  answer = tableOf * times;
  System.out.println(tableOf+ " * " + times +" = " + answer );
  times++;
  }
  
  System.out.println("Out of loop");
   
   }
  
  }