import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileReadDemo {

   public static void main(String[] args) throws IOException {
      // scanner object
      String fileName = JOptionPane.showInputDialog("Enter file name: ");

      // open a file for read
      File myFile = new File(fileName);

      // Scanner Object for file scan
      Scanner inputFile = new Scanner(myFile);

      while (inputFile.hasNext()) {
         // read a line
         String line = inputFile.nextLine();

         // Just displaying it on screen
         System.out.println(line);
      }
      // close the file
      inputFile.close();

   }
}
