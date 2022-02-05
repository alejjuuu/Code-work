import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class StudentInfo {
   static int getUserChoice(Scanner in){
       System.out.println("1. insert new student's information");
       System.out.println("2. fetch and output a student’s information");
       System.out.println("3. delete a student’s information");
       System.out.println("4. update a student’s information");
       System.out.println("5. output all student’s information");
       System.out.println("6. exit the program");
       int choice;
       while(true){
           System.out.print("Please make a choice: ");
           choice = Integer.parseInt(in.nextLine());
           if(choice < 1 || choice > 6){
               System.out.println("Invalid choice. Please try again!!");
           }
           else{
               break;
           }
       }
       return choice;
   }
  
   public static void main(String[] args){
       Hashtable<Integer, Student> students = new Hashtable<>();
       int choice, id;
       double gpa;
       String name;
       Scanner in = new Scanner(System.in);
       while(true){
           choice = getUserChoice(in);
           switch(choice){
           case 1:
               System.out.print("Enter name: ");
               name = in.nextLine();
               System.out.print("Enter id: ");
               id = Integer.parseInt(in.nextLine());
               System.out.print("Enter gpa: ");
               gpa = Double.parseDouble(in.nextLine());
               students.put(id, new Student(name, id, gpa));
               break;
           case 2:
               System.out.print("Enter id of the student: ");
               id = Integer.parseInt(in.nextLine());
               if(students.containsKey(id))
                   System.out.println(students.get(id));
               else
                   System.out.println("Student with id " + id + " is not found!");
               break;
           case 3:
               System.out.print("Enter id of the student: ");
               id = Integer.parseInt(in.nextLine());
               if(students.containsKey(id))
                   students.remove(id);
               else
                   System.out.println("Student with id " + id + " is not found!");
               break;
           case 4:
               System.out.print("Enter id of the student: ");
               id = Integer.parseInt(in.nextLine());
               if(students.containsKey(id)){
                   System.out.print("Enter name: ");
                   name = in.nextLine();
                   System.out.print("Enter gpa: ");
                   gpa = Double.parseDouble(in.nextLine());
                   Student s = students.get(id);
                   s.setGpa(gpa);
                   s.setName(name);
                   students.put(id, s);
                   System.out.println("Student record has been modified to " + s);
               }
               else{
                   System.out.println("Student with id " + id + " is not found!");
               }
               break;
           case 5:
               Set<Integer> keys = students.keySet();
               for(Iterator<Integer> itr = keys.iterator(); itr.hasNext(); ){
                   System.out.println(students.get(itr.next()));
               }
               break;
           case 6:
               return;
           }
           System.out.println();
       }
   }
  
}
