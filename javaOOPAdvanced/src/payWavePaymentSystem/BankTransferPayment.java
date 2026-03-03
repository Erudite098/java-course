package payWavePaymentSystem;

public class BankTransferPayment implements PaymentMethod, Refundable{
	
	/* Member Variables*/
	private String accountNumber;
	private double balance;
	
	public BankTransferPayment(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public boolean processRefund(double amount) {
		this.balance += amount;
		return true;
	}
	
	@Override
	public boolean processPayment(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	@Override
	public String getPaymentDetails() {
		String paymentDetails = String.format("BankTransfer [accountNumber = %s, balance = %.2f]", this.accountNumber, this.balance);
		return paymentDetails;
	}

}
