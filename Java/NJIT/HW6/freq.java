package NJIT.HW6;

import java.util.*;

public class freq {
    public static int[] numberFreq() {
        int[] arbitrary = new int[51];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("Please enter a new number from 1-50 ");
            int newNum = scan.nextInt();
            if (newNum >= 1 && newNum <= 50) {
                arbitrary[newNum]++;
            } else {
                System.out.println("Number not valid, please try again.");
            }
        }
        for (int x = 0; x < 50; x++) {
            System.out.println("\n" + x + "\t\t" + arbitrary[x]);
        }
        scan.close();
        return arbitrary;
    }
}
