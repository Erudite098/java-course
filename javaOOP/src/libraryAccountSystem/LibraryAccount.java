package libraryAccountSystem;

import java.util.Random;

public class LibraryAccount {
	
    /* MEMBER VARIABLES */
    private String accountHolder;
    private int borrowedBooks;
    private int accountNumber;

    private static int totalAccounts;
    private static int totalBorrowedBooks;
    
    private static Random random = new Random();
	
    /* CONSTRUCTOR */
    public LibraryAccount(String accountHolder) {
    	this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.borrowedBooks = 0;
    	totalAccounts++;
    }

    /* GETTERS */
    public String getAccountHolder() {
		return accountHolder;
	}
    
    public int getAccountNumber() {
		return accountNumber;
	}

    public int getBorrowedBooks() {
		return borrowedBooks;
	}
 
    public static int getTotalAccounts() {
		return totalAccounts;
	}
    
    public static int getTotalBorrowedBooks() {
		return totalBorrowedBooks;
	}

    /* METHODS */
    
    /**
     * DOCU: Increments the count of books borrowed by the user if they are under the limit.
     * Prevents borrowing if the limit of 5 books has been reached.
     * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public void borrowBook() {
        if (this.borrowedBooks >= 5) {
            System.out.println("Borrowing limit reached! Return some books before borrowing more.");    
        } 
        else {
            this.borrowedBooks++;
            totalBorrowedBooks++;
        }
    }

    /**
     * DOCU: Decrements the count of borrowed books for the user and the system total.
     * Validates that the user actually has books to return before updating counts.
     * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public void returnBook() {
        if (this.borrowedBooks > 0) {
            this.borrowedBooks--;
            totalBorrowedBooks--;
        } else {
            System.out.println(accountHolder + " has no books to return!");
        }       
    }

    /**
     * DOCU: Prints a summary of the account holder's current borrowing status.
     * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public void displayAccount() {
        System.out.printf("\n%s has %d borrowed books.", this.getAccountHolder(), this.getBorrowedBooks());
    }

    /**
     * DOCU: Generates a random 6-digit integer to serve as a unique account number.
     * @returns {int} - A random number between 100,000 and 999,999.
     * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    private int generateAccountNumber() {
        return random.nextInt(900000) + 100000;
    }

}
