package NJIT.HW9;

public class Firm { // extends Staff
	// -----------------------------------------------------------------
	// Creates a staff of employees for a firm and pays them.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Staff personnel = new Staff();

		// pay the staff
		// personnel.selectionSort(sortList);
		personnel.payday();
		personnel.vacation();
	}
}
