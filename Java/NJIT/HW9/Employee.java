package NJIT.HW9;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	// new variable
	protected int vacationDays = 10;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, Double rate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}

	// -----------------------------------------------------------------
	// Returns the pay rate for this employee.
	// -----------------------------------------------------------------
	public double pay() {
		return payRate;
	}

	public int vacation() {
		// TODO Auto-generated method stub
		return (int) vacationDays;
	}
}