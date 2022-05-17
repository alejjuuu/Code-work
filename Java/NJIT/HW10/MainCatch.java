package NJIT.HW10;

import java.util.*;

public class MainCatch {

    public static void main(String[] args) throws BonusTooLowException {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many executives will be entered? ");
        int executives = scan.nextInt();
        int validCount = 0;
        int averagePaid = 0;
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

            try {
                System.out.println("Enter bonus for employee " + (index + 1));
                double bonus = scan.nextDouble();
                staffList[index].awardBonus(bonus);
            } catch (BonusTooLowException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int index = 0; index < staffList.length; index++) {
            if (staffList[index].getBonus() > 2000) {
                validCount++;
            }
            averagePaid += staffList[index].pay();
        }
        System.out.println("The average pay was " + (averagePaid / (double) staffList.length)
                + " The total people with a bonus was " + validCount);
        scan.close();
        // throw new BonusTooLowException("You entered a bonus too low! It has to be
        // above $2000");

    }

}
