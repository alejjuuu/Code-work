 
 //beginning
   public class Car{

      private int yearModel;
      private String make;
      private int speed;

   public Car(int yearModel, String make){
      
      this.yearModel = yearModel;
      this.make = make;
      this.speed = 0;
      }
      
      //acceleration 
   public void accelerated()
   {
      speed+=5;
   }
   
   //brakes
   public void brake()
   {
      speed-=5;
   }
   
     public int getYearModel(){
         return yearModel;
      }
      
     public void setYearModel(int yearModel){
         this.yearModel = yearModel;
     }
     
     public String getMake(){
         return make;
     }
     
     public void setMake(String make){
         this.make = make;
     }
     
     public int getSpeed(){
         return speed;
     }
     
     public void setSpeed(int speed){
         this.speed = speed;
     }
     
     //system.out.println lines
     
     public static void main(String[] args){
     
     Car car=new Car( 2012,"Honda Civic");
     System.out.println(" My car is a " + car.getYearModel()+ "" + car.getMake());
     
     car.accelerated();
     System.out.println("Speed:" + car.getSpeed());
     car.accelerated();
     System.out.println("Speed:" + car.getSpeed());
     car.accelerated();
     System.out.println("Speed:" + car.getSpeed());
     car.accelerated();
     System.out.println("Speed:" + car.getSpeed());
     car.accelerated();
     System.out.println("Speed:" + car.getSpeed());
     
     car.brake();
     System.out.println("Speed:" + car.getSpeed());
     car.brake();
     System.out.println("Speed:" + car.getSpeed());
     car.brake();
     System.out.println("Speed:" + car.getSpeed());
     car.brake();
     System.out.println("Speed:" + car.getSpeed());
     car.brake();
     System.out.println("Speed:" + car.getSpeed());
     
     }
  }
 