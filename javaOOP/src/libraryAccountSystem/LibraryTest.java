package libraryAccountSystem;

public class LibraryTest {

	public static void main(String[] args) {
		
        // Create 3 library accounts
        LibraryAccount user1 = new LibraryAccount("Alice");
        LibraryAccount user2 = new LibraryAccount("Bob");
        LibraryAccount user3 = new LibraryAccount("Charlie");

        // Random 6-digit Account Test
        System.out.printf("%s's account number: %d\n", user1.getAccountHolder(), user1.getAccountNumber());
        System.out.printf("%s's account number: %d\n", user2.getAccountHolder(), user2.getAccountNumber());
        System.out.printf("%s's account number: %d\n\n", user3.getAccountHolder(), user3.getAccountNumber());
        
        // Borrow Test with borrow limit
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        user1.borrowBook();
        System.out.printf("%s borrowed %d books\n", user1.getAccountHolder(), user1.getBorrowedBooks());
            
        user2.borrowBook();
        System.out.printf("%s borrowed %d books\n", user2.getAccountHolder(), user2.getBorrowedBooks());
        
        user3.borrowBook();
        System.out.printf("%s borrowed %d books\n", user3.getAccountHolder(), user3.getBorrowedBooks());

        // Display accounts
        user1.displayAccount();
        user2.displayAccount();
        user3.displayAccount();

        // Return Test
        user1.returnBook();
        System.out.printf("\n\n%s returned a book. Now has %d\n", user1.getAccountHolder(), user1.getBorrowedBooks());
        
        user2.returnBook();
        System.out.printf("%s returned a book. Now has %d\n", user2.getAccountHolder(), user2.getBorrowedBooks());
       
        user3.returnBook();
        System.out.printf("%s returned a book. Now has %d\n", user3.getAccountHolder(), user3.getBorrowedBooks());

        // Display again after returning
        user1.displayAccount();
        user2.displayAccount();
        user3.displayAccount();

        // Static Test
        System.out.println("\n\nTotal Accounts: " + LibraryAccount.getTotalAccounts());
        System.out.println("Total Borrowed Books: " + LibraryAccount.getTotalBorrowedBooks());
	}

}
