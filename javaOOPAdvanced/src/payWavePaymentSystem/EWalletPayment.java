package payWavePaymentSystem;

public class EWalletPayment implements PaymentMethod{
	
	/* Member Variables*/
	private String walletID;
	private double balance;

	public EWalletPayment(String walletID, int balance) {
		this.walletID = walletID;
		this.balance = balance;
	}

	@Override
	public boolean processPayment(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	@Override
	public String getPaymentDetails() {
		String paymentDetails = String.format("EWallet [walletID = %s, balance = %.2f]", this.walletID, this.balance);
		return paymentDetails;
	}
	
	

}
