package Final_project_ccm;

//import java.util.Hashtable;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FinalProjectCMP128 {

    static int getUserChoice(Scanner in) {
        int choice;
        System.out.println("------------------------------");
        System.out.println("CCM Student Enrollment");
        System.out.println("1. Add New Student");
        System.out.println("2. Remove student");
        System.out.println("3. Edit Student Information");
        System.out.println("4. Display all students");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Please make a choice: ");

            choice = Integer.parseInt(in.nextLine());
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again!!");
            } else {
                break;
            }
        }
        return choice;
    }

    // main class
    public static void main(String[] args) {

        // I used the hastable instead of an Array since it offers fast insertion and
        // searching.
        Hashtable<Integer, Student> students = new Hashtable<>();
        int choice, id;

        String Firstname, Lastname, Major, Address;
        ;
        Scanner in = new Scanner(System.in);

        // while loop
        while (true) {
            choice = getUserChoice(in);
            switch (choice) {
                case 1:
                    try {
                        // first name input
                        System.out.print("Enter Student's Fisrt name: ");
                        Firstname = in.nextLine();
                        // last name input
                        System.out.print("Enter Student's Last Name: ");
                        Lastname = in.nextLine();
                        // Id input
                        System.out.print("Enter Student's Major: ");
                        Major = in.nextLine();
                        System.out.print("Enter Student's ID: ");
                        // To convert a string to integer I'm using .parseInt and .parsedouble
                        id = Integer.parseInt(in.nextLine());

                        System.out.print("Enter Student's Address: ");
                        Address = in.nextLine();
                        // (hastable) using .put to create a new student with its info
                        students.put(id, new Student(id, Firstname, Lastname, Major, Address, Major));
                    } catch (Exception e) {
                        System.out.println("An error in case one has occured");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter the ID of the student: ");

                        id = Integer.parseInt(in.nextLine());
                        if (students.containsKey(id))
                            students.remove(id);
                        else
                            System.out.println("The student with ID " + id + " was not found!");
                    } catch (Exception e) {
                        System.out.println("An error in case two has occured");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter the ID of the student: ");
                        id = Integer.parseInt(in.nextLine());

                        if (students.containsKey(id)) {
                            System.out.print("Enter Student's First name: ");
                            Firstname = in.nextLine();

                            System.out.print("Enter Student's Last name: ");
                            Lastname = in.nextLine();

                            System.out.print("Enter Student's major: ");
                            Major = in.nextLine();

                            System.out.print("Enter Student's address: ");
                            Address = in.nextLine();

                            Student s = students.get(id);
                            s.setaddress(Address);
                            s.setfirstname(Firstname);
                            s.setlastname(Lastname);
                            s.setmajor(Major);
                            students.put(id, s);
                            System.out.println("Student record has been modified to " + s);
                        } else {
                            System.out.println("Student with ID " + id + " was not found!");
                        }
                    } catch (Exception e) {
                        System.out.println("An error in case three has occured");
                    }
                    break;
                case 4:
                    try {
                        Set<Integer> keys = students.keySet();
                        // Using iterator to enumerate, get, remove and create a kind of boolean to
                        // modify the list in the array or hastable
                        for (Iterator<Integer> itr = keys.iterator(); itr.hasNext();) {
                            System.out.println(students.get(itr.next()));
                        }
                    } catch (Exception e) {
                        System.out.println("An error in case four has occured");
                    }
                    break;
                case 5:
                    return;
            }
            System.out.println();
        }
    }

}
