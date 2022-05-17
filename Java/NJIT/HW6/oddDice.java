package NJIT.HW6;

public class oddDice {
    private int[] dice1;

    public int[] die(Die... dice) {
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            if (dice[i].getFaceValue() % 2 != 0) {
                dice1[i] = dice[i].getFaceValue();
            }
        }
        return dice1;
    }
}
