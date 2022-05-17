package NJIT.HW10;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
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
}