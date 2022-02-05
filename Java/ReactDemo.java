public class ReactDemo{

   public static void main(String[] args){
   
      //lets create the rectangle class object here
      
      Rectangle livingRoom = new Rectangle();
      
      livingRoom.setLength(16);
      livingRoom.setWidth(14);
      
      System.out.println("The area of my living room is" + livingRoom.getArea());
      
      Rectangle masterBedRoom = new Rectangle();
      masterBedRoom.setLength(20);
      masterBedRoom.setwidth(40);
      
      System.out.println("The area of my Master Ben room is:" + masterBedRoom.getArea());
      
      
   
   }
   }