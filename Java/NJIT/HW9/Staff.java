package NJIT.HW9;

public class Staff {
	private StaffMember[] staffList;

	public Staff() {
		staffList = new StaffMember[6];
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
		staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
		((Executive) staffList[0]).awardBonus(500.00);
		((Hourly) staffList[3]).addHours(40);
	}

	public void payday() {
		double amount;
		for (int count = 0; count < staffList.length; count++) {
			System.out.println(staffList[count]);
			amount = staffList[count].pay();
			if (amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + amount);
			System.out.println("-----------------------------------");
		}
	}

	public void vacation() {
		for (int employee = 0; employee < staffList.length; employee++) {
			System.out.println(staffList[employee]);

			if (staffList[employee] instanceof Employee) {
				System.out.println("Vacations: " + ((Employee) staffList[employee]).vacation() + " days.");
				System.out.println("-----------------------------------");
			}
		}
	}

	public static void newSelectionSort(StaffMember[] staffList) {
		for (int i = 0; i < staffList.length; i++) {
			for (int j = i + 1; j < staffList.length; j++) {
				// swap elements if conditions are met:
				if (staffList[i].compareTo(staffList[j]) >= 0) {
					StaffMember temp = staffList[i];
					staffList[i] = staffList[j];
					staffList[j] = temp;
				}
			}
		}
	}

	// first way to sort out
	public static void selectionSort(StaffMember[] staffList) {
		int min;
		Comparable temp;

		for (int index = 0; index < staffList.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < staffList.length; scan++)
				if (staffList[scan].compareTo(staffList[min]) < 0)
					min = scan;

			// Swap the values
			temp = (Comparable) staffList[min];
			staffList[min] = staffList[index];
			staffList[index] = (StaffMember) temp;
		}
	}

	// second way to sort out
	public static void insertionSort(Comparable[] staffList) {
		// loop through the list
		for (int i = 1; i < staffList.length; i++) {
			Comparable key = staffList[i];
			int position = i;

			// Shift larger values to the left does not work for now
			while (position > 0 && key.compareTo() > 0) {
				staffList[position] = staffList[position - 1];
				position--;
			}
			staffList[position] = key;
		}
	}
}