package NJIT.HW6;

public class bigEven {

    public int bigEven(int[] numArray, int target) {
        int count = 0;
        for (int i = 0; i < numArray.length + 1; i++) {
            if ((numArray[i] % 2 == 0) && (numArray[i] > target)) {
                count++;
            }
        }
        return count;
    }
}
