package NJIT.HW2;

//********************************************************************
//  NameAverage.java       
//
//  Gets the average of four names length, and the first letter of each
// then prints the results
//********************************************************************
import java.util.*;

public class NameAverage {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String name0;
      String name1;
      String name2;
      String name3;

      System.out.println("Please input the name of the four students followed by a space: ");
      name0 = scan.next();
      name1 = scan.next();
      name2 = scan.next();
      name3 = scan.next();
      double average = ((name0.length() + name1.length() + name2.length() + name3.length()) / 4);
      String firstLetter = name0.substring(0, 1) + name1.substring(0, 1) + name2.substring(0, 1)
            + name3.substring(0, 1);

      System.out.print(average + "\n" + firstLetter);
      scan.close();
   }
}