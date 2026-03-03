package customerOrderSystem;

public class TestOrders {

	public static void main(String[] args) {
		
		// Items
		Item item1 = new Item("Latte", 3.21);
		Item item2 = new Item("Muffin", 5.93);
		Item item3 = new Item("Capuccino", 4.57);
		Item item4 = new Item("Croissant", 6.75);
		
		// 2 orders for unspecified guests (no name provided)
		Order guestCustomer1 = new Order();
		Order guestCustomer2 = new Order();

		// 3 orders with specific names using the overloaded constructor.
		Order customer1 = new Order("Alice");
		Order customer2 = new Order("Bob");
		Order customer3 = new Order("Charlie");
		
		// 2 items to each order
		guestCustomer1.addItem(item1);
		guestCustomer1.addItem(item4);

		guestCustomer2.addItem(item3);
		guestCustomer2.addItem(item1);
		
		customer1.addItem(item2);
		customer1.addItem(item4);
		
		customer2.addItem(item4);
		customer2.addItem(item3);
		
		customer3.addItem(item1);
		customer3.addItem(item2);
		
		// Set some orders to true
		guestCustomer1.setReady(false);
		guestCustomer2.setReady(true);
		customer1.setReady(false);
		customer2.setReady(true);
		customer3.setReady(true);
		
		// Display order details, total order price and order status
		guestCustomer1.display();
		System.out.println("Total: " + guestCustomer1.getOrderTotal());
		guestCustomer1.getStatusMessage();
		
		guestCustomer2.display();
		System.out.println("Total: " + guestCustomer2.getOrderTotal());
		guestCustomer2.getStatusMessage();
		
		customer1.display();
		System.out.println("Total: " + customer1.getOrderTotal());
		customer1.getStatusMessage();
		
		customer2.display();
		System.out.println("Total: " + customer2.getOrderTotal());
		customer2.getStatusMessage();
		
		customer3.display();
		System.out.println("Total: " + customer3.getOrderTotal());
		customer3.getStatusMessage();
	}

}
