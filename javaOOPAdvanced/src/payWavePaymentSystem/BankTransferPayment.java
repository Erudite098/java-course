package payWavePaymentSystem;

public class BankTransferPayment implements PaymentMethod, Refundable{
	
	/* Member Variables*/
	private String accountNumber;
	private double balance;
	
	/* Constructor */
	public BankTransferPayment(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	/**
     * DOCU: Increases the account balance by the specified refund amount.
     * @param {double} amount - The monetary value to be added to the balance.
     * @returns {boolean} - Always returns true once the balance is updated.
     * * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public boolean processRefund(double amount) {
        this.balance += amount;
        return true;
    }
    
    /**
     * DOCU: Deducts a positive amount from the balance if sufficient funds exist.
     * @param {double} amount - The monetary value to be transferred.
     * @returns {boolean} - Returns true if the amount is valid and covered by the balance; otherwise false.
     * * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public boolean processPayment(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    /**
     * DOCU: Returns a summary of the bank transfer account details and current balance.
     * @returns {String} - A formatted string with account number and balance information.
     * * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public String getPaymentDetails() {
        String paymentDetails = String.format("BankTransfer [accountNumber = %s, balance = %.2f]", this.accountNumber, this.balance);
        return paymentDetails;
    }

}
