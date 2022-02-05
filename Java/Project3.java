import java.util.Scanner;
import java.text.DecimalFormat;

public class Project3
{
	public static void main (String [] args)
	{
   
   double price_A = 9.95;
   double price_B = 13.95;
   double price_C = 19.95;
   double month_A = 10;
   double month_B = 20;
   double totalA;
   double totalB;
   double totalC;
   double total;
   String subscription;
   
   
         Scanner keyboard = new Scanner (System.in);
         DecimalFormat df = new DecimalFormat(".00");
         
         System.out.println("Welcome to Project3 your internet provider");
         System.out.println("Package A");
         System.out.println("Package B");
         System.out.println("Package C");

         System.out.println("please chose your subcription package");
         subscription = keyboard.nextLine();
         if (subscription.equalsIgnoreCase("A") )
         {  
         double hrs;
         double total1;
         double total2;
         double total3;
         double total4;
        
         //this ask the the user how many hrs he/she has use the internet.
         System.out.println("Please Enter the number of hours Use"); 
         hrs = keyboard.nextDouble();
         
            //this checks if the hrs is less than the package A
            if(hrs<=month_A){
            System.out.println("your total is :"+price_A);
            
            
            }
            //this checks if the hrs are bewteen 12 hrs and 20hrs
            if(hrs >= 12 && hrs <= month_B){
             total1 = hrs - month_A;
            total2 = total1 * 2.00;
            totalA = total2 + price_A;
            total = totalA - price_B;
            System.out.println("your total price is :" + totalA);
            System.out.println("if you had Package B you would have pay:"+ total);
            }
                 
            //thic checks if the hrs is greater than 20hrs but less than 26hrs
            if(hrs>month_B && hrs < 26){
            total1 = hrs - month_A;
            total2 = total1 * 2.00;
            totalA = total2 + price_A;
            System.out.println("your total price is :" + totalA+"$");
            
            

            total3 = hrs - month_B;
            total4= total3 * 1.00;
            totalB= total4 + price_B;
            total= totalA - totalB;
            System.out.println("if you had chossen package B, You would have save " + total +"$");
            
            }
            //this checks if hrs is greater than 26hrs
            if(hrs >= 26){
            total1 = hrs - month_A;
            total2 = total1 * 2.00;
            totalA = total2 + price_A;
            total = totalA - 19.95;
            System.out.println("your total price is :" + totalA+"$");
             System.out.println("if you had chossen package C, You would have save " + total +"$");
            

            }
         
         
              }  
         //this check if the person has choosen package B
          if (subscription.equalsIgnoreCase("B") )
         {  
         double hrs;
         double total1;
         double total2;
        
         
         System.out.println("Please Enter the number of hours Use"); 
         hrs = keyboard.nextDouble();
         
         if(hrs<=month_A){
         total= price_B - price_A;
         System.out.println("your total is :" +price_B);
         System.out.println("you would have save:"+ df.format(total) +  "dollars if you had package A");
        
         }
         if(hrs>=12 && hrs<=month_B){
          System.out.println("your total is :" +price_B);
         }
         
         if(hrs >= month_B && hrs < 26){
         total1 = hrs - month_B;
         total2 = total1 * 1.00;
         totalB = total2 + price_B;
         
         System.out.println("your total price is:" + df.format(totalB)+"$");

         }
         if(hrs>=27){
         total1 = hrs - month_B;
         total2 = total1 * 1.00;
         totalB = total2 + price_B;
         total= totalB - price_C;
         
         System.out.println("your total price is:" + df.format(totalB)+"$");
         System.out.println("your could have save  " + total + " dollars if yout had package C ");

         }
         
                  
      } 
         
         
         
         
         
          if (subscription.equalsIgnoreCase("C") )
         { 
         double hrs;
         
              System.out.println("Please Enter the number of hours Use"); 
         hrs = keyboard.nextDouble();
               
               if(hrs<= month_A){
               
               total = price_C - price_A;
               
                  System.out.println("your total is: "+ price_C);
                  System.out.println("if you had package A you could have save: "+total);
               }
               
               if(hrs>=12 && hrs <= month_B ){
               total = price_C - price_B;
               System.out.println("your total is: "+price_C);
               System.out.println("if you had package B you could have save: "+total);

               }
               
               if(hrs>month_B){
               
               System.out.println("your total is: "+price_C);
               
               }
               
               
               
                            
          } 
         
                
         
        
   
   }}
