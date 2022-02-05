import java.io.*;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileWriteDemo
{
   public static void main (String[]args) throws IOException {
      String fileName;
      String friendName;
      int numberOfFriends;


//Scanner keyboard = new Scanner(System.in);
fileName = JOptionPane.showInputDialog("Enter file name:");

//Open the file 
//PrintWriter outputFile = new PrintWriter(fileName);
//Open the file 
FileWriter fwriter = new FileWriter(fileName, true);

PrintWriter outputFile = new PrintWriter(fwriter);

for(int i=1; i<=3; i++){

//get input for friend name0
friendName = JOptionPane.showInputDialog("Enter your friend name:");
//write a line in to the open file 
outputFile.println(friendName);

}
//close file
outputFile.close();



System.out.println("your file " + fileName + "is created:");

}
}
