package NJIT.HW7;

public class TestArraysAndRecursion {
    public static void main(String[] args) {
        // Test of the first problem here
        int[][] starArr = {
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 }
        };
        initialize(starArr);
        System.out.println(" ");

        // Test of the second problem here
        Die[][] diceArr = {
                { new Die(), new Die(), new Die() },
                { new Die(), new Die(), new Die() } };

        int[] newArr = dieStats(diceArr);
        System.out.print("\ndieArr stats: \n");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println(" ");

        // Test of the third problem here
        int startNum = 23145;
        System.out.print("\n The starting number is: \n" + startNum + "\n end result is:\n");
        printDigits(startNum);
        System.out.println(" ");

        // Test of the fourth problem here
        int[] a = { 1, 3, 2, 5 };
        System.out.print(sumArray(a, 4));
    }

    // First problem here
    public static void initialize(int[][] arr) {
        arr[0][0] = -1;
        arr[arr.length - 1][arr.length - 1] = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    arr[i][j] = i + j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    // Second problem here
    public static int[] dieStats(Die[][] dice) {
        int[] simArr = new int[dice.length];
        System.out.println("2D Die array after dieArr() ");
        for (int i = 0; i < dice.length; i++) {
            int count = 0;
            for (int j = 0; j < dice[i].length; j++) {
                dice[i][j].roll();
                if (dice[i][j].getFaceValue() % 2 == 0) {
                    count++;
                }
                System.out.print(dice[i][j] + ",");
            }
            simArr[i] = count;
        }
        return simArr;
    }

    // Third problem here
    public static int printDigits(int num) {
        int digit = 0;
        if (num == 0) {
            return 0;
        } else if (num > 1) {
            System.out.print(num % 10);
            printDigits(num / 10);
        }
        return digit;
    }

    // Fourth problem here
    public static int sumArray(int[] numbersToAdd, int numArray) {

        if (numArray > 0) {
            return (sumArray(numbersToAdd, (numArray - 1)) + numbersToAdd[numArray - 1]);
        } else if (numArray == 0) {
            System.out.print("\nBye  ");
        }
        return numArray;
    }
}
