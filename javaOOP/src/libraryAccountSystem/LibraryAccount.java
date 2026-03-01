package libraryAccountSystem;

import java.util.Random;

public class LibraryAccount {
	
    // MEMBER VARIABLES
    private String accountHolder;
    private int borrowedBooks;
    private int accountNumber;

    private static int totalAccounts;
    private static int totalBorrowedBooks;
    
    private static Random random = new Random();
	
    // CONSTRUCTOR
    public LibraryAccount(String accountHolder) {
    	this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.borrowedBooks = 0;
    	totalAccounts++;
    }

    // GETTERS  
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

    // METHODS   
    public void borrowBook() {
    	
		if (this.borrowedBooks >= 5) {
			System.out.println("Borrowing limit reached! Return some books before borrowing more.");	
		} 
		else {
			this.borrowedBooks++;
			totalBorrowedBooks++;
		}
  
	}

    public void returnBook() {
		if(this.borrowedBooks > 0) {
			this.borrowedBooks--;
			totalBorrowedBooks--;
		} else {
			System.out.println(accountHolder + " has no books to return!");
		}    	
	}

    public void displayAccount() {
    	System.out.printf("\n%s has %d borrowed books.", this.getAccountHolder(), this.getBorrowedBooks());
	}
    
    private int generateAccountNumber() {
    	return random.nextInt(900000) + 100000;
	}

}
