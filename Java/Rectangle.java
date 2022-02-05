//import java.util.Random; 
//import java.util.Scanner;
public class Rectangle{
	//public static void main (String [] args){
   //define private fields 
   private double length = 0;
   private double width = 0;
   //Define accessor methods 
   public void setLength(double len){
      length = len;
   }
   public void setWidth(double w){
      width = w;
   }
   //define accesor methods to read fields
   public double getLength(){
      return length;
   }
   public double getWidth(){
      return width;
   }
   //constructor methods
   //executes automatically when user of the class create an object
   public Rectangle(){
      length = 0;
      width = 0;
   }
   public Rectangle(double len, double w){
      length = 0;
      width = 0;
   }
   
   //methods 
   public double getArea(){
      double area = 0.0;
      area = length * width;
      return area;
}
}