package payWavePaymentSystem;

import java.util.ArrayList;

public class TransactionTester {

	public static void main(String[] args) {
		
		/* --- Test Data --- */
        CreditCardPayment cc = new CreditCardPayment("CC-5566", 5000);
        EWalletPayment ewallet = new EWalletPayment("EW-1010", 1000);
        BankTransferPayment bank = new BankTransferPayment("BT-9999", 2000);

        System.out.println("--- Starting Payment Tests ---");

        /* --- Successful Payments --- */
        testPayment(cc, 500, "Credit Card Normal Purchase");
        testPayment(ewallet, 200, "E-Wallet Coffee Purchase");
        testPayment(bank, 1500, "Bank Transfer Rent");

        /* --- Insufficient Funds --- */
        testPayment(ewallet, 5000, "E-Wallet Overdraw (Should Fail)");
        testPayment(bank, 3000, "Bank Overdraw (Should Fail)");

        System.out.println("\n--- Starting Refund Tests ---");

        /* --- Successful Refunds & Interface Checking --- */
        testRefund(cc, 200, "Credit Card");
        testRefund(bank, 500, "Bank Transfer");
        
        /* This would cause a compile error if we tried it with ewallet! */
        // testRefund(ewallet, 100); 

        System.out.println("\n--- Final States ---");
        System.out.println(cc.getPaymentDetails());
        System.out.println(ewallet.getPaymentDetails());
        System.out.println(bank.getPaymentDetails());
    }

	/**
	 *  DOCU: Executes a payment through the provided interface and logs the transaction details.
     * @param {PaymentMethod} method - The specific implementation used to process the charge.
     * @param {double} amount - The monetary value to be charged.
     * @param {String} description - A label identifying the transaction.
     * 
     * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    public static void testPayment(PaymentMethod method, double amount, String description) {
        boolean success = method.processPayment(amount);
        System.out.printf("%n[%s] \nAmount: %.2f \nSuccess: %b \nDetails: %s%n", 
            description, amount, success, method.getPaymentDetails());
    }

    /** 
     * DOCU: Processes a refund for any object implementing the Refundable interface.
     * @param {Refundable} ref - The refundable entity processing the return.
     * @param {double} amount - The monetary value to be refunded.
     * @param {String} description - A label identifying the refund.
     * 
     * Last Updated: 2026-03-03  
     * Author: Kerzania  
     */
    public static void testRefund(Refundable ref, double amount, String description) {
        boolean success = ref.processRefund(amount);
        System.out.printf("(%s)[Refund] Amount: %.2f | Success: %b%n", description, amount, success);	
    }

}
