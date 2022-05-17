package NJIT.HW10;

import java.util.*;

public class MainThrow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many executives will be entered? ");
        int executives = scan.nextInt();
        Executive[] staffList = new Executive[executives];

        for (int index = 0; index < executives; index++) {
            System.out.println("Input the " + (index + 1) + " Employee's name");
            String name = scan.next();
            System.out.println("Input the " + (index + 1) + " Employee's address");
            String address = scan.next();
            System.out.println("Input the " + (index + 1) + " Employee's phone");
            String phone = scan.next();
            System.out.println("Input the " + (index + 1) + " Employee's Social Security Number");
            String socNumber = scan.next();
            System.out.println("Input the " + (index + 1) + " Employee's rate");
            Double rate = scan.nextDouble();

            staffList[index] = new Executive(name, address, phone, socNumber, rate);
            System.out.println(staffList[index]);
        }
        int index = 0;
        do {
            System.out.println("Enter bonus for employee " + (index + 1));
            double bonus = scan.nextDouble();
            try {
                staffList[index].awardBonus(bonus);
            } catch (BonusTooLowException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            index++;
        } while (index < staffList.length);
        scan.close();

    }
}
