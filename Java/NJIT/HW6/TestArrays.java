package NJIT.HW6;

import java.util.*;

public class TestArrays {

    public static void main(String[] args) {

        int[] freq = numberFreq();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
            } else {
                System.out.println((i) + " happened " + freq[i] + " times");
            }
        }
        int[] array = { 2, 7, 8, 3, 4, 10 };
        int target = 5;
        System.out.println("Here big even " + bigEven(array, target));

        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die();
        Die die5 = new Die();
        Die[] dices = new Die[5];
        dices[0] = die1;
        dices[1] = die2;
        dices[2] = die3;
        dices[3] = die4;
        dices[4] = die5;

        System.out.println(oddDie(dices));

    }

    public static int[] numberFreq() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the array length. ");
        int LIMIT = scan.nextInt();
        int[] arbitrary = new int[50];
        for (int i = 0; i < LIMIT; i++) {
            System.out.println("Please enter a new number from 0-" + 50);
            int newNum = scan.nextInt();
            if (newNum >= 0 && newNum <= 50) {
                arbitrary[newNum]++;
            } else {
                i--;
                System.out.println("Number not valid, please try again.");
            }
        }
        scan.close();
        return arbitrary;
    }

    public static int bigEven(int[] numArray, int target) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if ((numArray[i] % 2 == 0) && (numArray[i] > target)) {
                count++;
            }
        }
        return count;
    }

    public static String oddDie(Die[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            if (dice[i].getFaceValue() % 2 != 0) {
                count++;
            }
        }
        return ("The total odd number is " + count);
    }
}
