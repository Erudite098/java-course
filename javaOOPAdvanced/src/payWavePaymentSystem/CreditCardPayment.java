package payWavePaymentSystem;

public class CreditCardPayment implements PaymentMethod, Refundable {
	
	/* Member Variables*/
	private String cardNumber;
	private double creditLimit;
	private double availableCredit;
	
	/* Constructor */
	public CreditCardPayment(String cardNumber, double creditLimit) {
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.availableCredit = creditLimit;
		
	}

	/**
     * DOCU: Processes a refund by increasing the available credit by the specified amount.
     * @param {double} amount - The monetary value to be added back to the credit line.
     * @returns {boolean} - Always returns true as the refund is applied immediately.
     * 
     * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public boolean processRefund(double amount) {
        this.availableCredit += amount;
        return true;
    }
    
    /**
     * DOCU: Validates and deducts a payment amount from the available credit.
     * @param {double} amount - The monetary value to be charged.
     * @returns {boolean} - Returns true if the amount is positive and within credit limits; otherwise false.
     * 
     * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0 || amount > this.availableCredit) {
            return false;
        }
        
        this.availableCredit -= amount;
        return true;
    }
    
    /**
     * DOCU: Compiles and returns a string representation of the credit card's current state.
     * @returns {String} - A formatted string containing the card number and available credit.
     * 
     * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    @Override
    public String getPaymentDetails() {
        String paymentDetails = String.format("CreditCard [cardNumber = %s, availableCredit = %.2f]", this.cardNumber, this.availableCredit);
        return paymentDetails;
    }
}
