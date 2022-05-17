package NJIT.HW10;

public class Executive extends Employee {
	private double bonus;

	// -----------------------------------------------------------------
	// Constructor: Sets up this executive with the specified
	// information.
	// -----------------------------------------------------------------
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		bonus = 0; // bonus has yet to be awarded
	}

	public void awardBonus(double execBonus) throws BonusTooLowException {
		if (execBonus < 2000) {
			throw new BonusTooLowException("You entered a bonus too low! It has to be above $2000");
		}
		bonus = execBonus;
	}

	public double getBonus() {
		return bonus;
	}

	// -----------------------------------------------------------------
	// Computes and returns the pay for an executive, which is the
	// regular employee payment plus a one-time bonus.
	// -----------------------------------------------------------------
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}

}
