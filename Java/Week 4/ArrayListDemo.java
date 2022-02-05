import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo{
   public static void main(String[] args){
   
      ArrayList myList = new ArrayList();
      
      // Fixed Data Type Array List, which will store only String type values
      List<String> studentsName = new ArrayList();
      
      myList.add(500); // index = 0
      myList.add(544); // index = 1
      myList.add(100); // index = 2
      myList.add(500); // index = 2
      
      studentsName.add("Jefrey");
      
      studentsName.add("Jessica");
      studentsName.add("900");
      
      //myList.set(2, "Waseem"); // Altering the value of arraylist item # 3
      
      //myList.clear(); // Remvoe all the items from the Array List
      
      myList.remove(2) ; 
      
      for(int counter=0; counter < myList.size() ; counter++){
         System.out.println(myList.get(counter));
      }
      
   
   }
}