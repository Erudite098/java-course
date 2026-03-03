package payWavePaymentSystem;

public class EWalletPayment implements PaymentMethod{
	
	/* Member Variables*/
	private String walletID;
	private double balance;

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
		String paymentDetails = String.format("EWallet [walletID = %s, balance = %d]", this.walletID, this.balance);
		return paymentDetails;
	}
	
	

}
