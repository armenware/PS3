package base;

public class InsufficientFundsException extends Exception {
	private double withdraw_amount;

	public InsufficientFundsException(double withdraw_amount) {
		this.withdraw_amount = withdraw_amount;

	}

	public double getWithdrawAmount() {
		return withdraw_amount;
	}
}

