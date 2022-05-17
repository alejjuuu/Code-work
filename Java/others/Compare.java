package others;

public class Compare {
   public static void main(String[] args) {

      String name1 = "Mark";
      String name2 = "Mark";

      int output = name1.compareTo(name2);
      /* String Funtion */
      // compareTo ()
      // equalsIgnoreCase()
      // toUpper()
      // toLower()
      // charAt(index)
      System.out.println(name1.toUpperCase());

      System.out.println(output);

      if (name1.compareTo(name2) == 0) {
         System.out.println("Your strings are matching");
      } else {
         System.out.println("Not matching");
      }

   }

}
