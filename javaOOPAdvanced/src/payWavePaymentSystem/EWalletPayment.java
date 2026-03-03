package payWavePaymentSystem;

public class EWalletPayment implements PaymentMethod{
	
	/* Member Variables*/
	private String walletID;
	private double balance;

	/* Constructor */
	public EWalletPayment(String walletID, int balance) {
		this.walletID = walletID;
		this.balance = balance;
	}
	
	/**
     * DOCU: Validates and deducts a payment amount from the wallet balance.
     * @param {double} amount - The monetary value to be charged.
     * @returns {boolean} - Returns true if the balance is sufficient; otherwise false.
     * * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public boolean processPayment(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    /**
     * DOCU: Compiles and returns a string representation of the wallet's current status.
     * @returns {String} - A formatted string containing the wallet ID and balance.
     * * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public String getPaymentDetails() {
        String paymentDetails = String.format("EWallet [walletID = %s, balance = %.2f]", this.walletID, this.balance);
        return paymentDetails;
    }
	
	

}
