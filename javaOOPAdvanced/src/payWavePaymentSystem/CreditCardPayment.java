package payWavePaymentSystem;

public class CreditCardPayment implements PaymentMethod, Refundable {
	
	/* Member Variables*/
	private String cardNumber;
	private double creditLimit;
	private double availableCredit;
	
	@Override
	public boolean processRefund(double amount) {
		this.availableCredit = amount;
		return true;
	}
	
	@Override
	public boolean processPayment(double amount) {
		if (amount <= 0 || amount > creditLimit) {
			return false;
		}
		
		this.creditLimit -= amount;
		return true;
	}
	
	@Override
	public String getPaymentDetails() {
		String paymentDetails = String.format("CreditCard [cardNumber = %s, availableCredit = %d]", this.cardNumber, this.availableCredit);
		return paymentDetails;
	}
}
