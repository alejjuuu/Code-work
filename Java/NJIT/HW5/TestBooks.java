package NJIT.HW5;

import java.util.*;

public class TestBooks {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many books do you want to review? ");
        int repetitions = scan.nextInt();

        int total = 0;
        int counter = 0;
        Book book1 = new Book(0, "");

        scan.nextLine();

        for (int i = 0; i < repetitions; i++) {

            System.out.println("what's the publisher's name? ");
            String publisher = scan.nextLine();

            int random = (generator.nextInt(100) + 1);

            Book book2 = new Book(random, publisher);
            total += random;
            counter++;

            // System.out.println("Here compare to " + book2.compareTo(book1));
            if (book2.compareTo(book1) == 1) {
                // book1.setPages(sumOfPages);
                // book1.setPublisher(publisher);
                book1 = book2;
            }
        }
        System.out.println("");
        System.out.println("Summary: " + book1.toString());
        // System.out.println("Here total of pages" + total);
        System.out.println("The average page was " + (total / (double) counter));

        scan.close();
    }
}
