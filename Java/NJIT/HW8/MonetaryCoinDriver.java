package NJIT.HW8;

public class MonetaryCoinDriver {

    public static void main(String[] args) {
        int outCounter = 0;
        MonetaryCoin[] arr = new MonetaryCoin[20];
        for (int i = 0; i < arr.length; i++) {
            int value = (int) (Math.random() * 100) + 1;
            arr[i] = new MonetaryCoin(value);
            arr[i].flip();
            if (!arr[i].isHeads() && arr[i].getCents() > outCounter) {
                outCounter = arr[i].getCents();
            }
        }
        System.out.println("The highest TAIL monetary value was " + outCounter);
    }
}
