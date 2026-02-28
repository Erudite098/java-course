package customerOrderSystem;

public class TestOrders {

	public static void main(String[] args) {
		
		// Items
		Item item1 = new Item("Latte", 3.21);
		Item item2 = new Item("Muffin", 5.93);
		Item item3 = new Item("Capuccino", 4.57);
		Item item4 = new Item("Croissant", 6.75);
		
		// 2 orders for unspecified guests (no name provided)
		Order order1 = new Order();
		Order order2 = new Order();

		// 3 orders with specific names using the overloaded constructor.
		Order order3 = new Order("Alice");
		Order order4 = new Order("Bob");
		Order order5 = new Order("Charlie");
		
		// 2 items to each order
		order1.addItem(item1);
		order1.addItem(item4);

		order2.addItem(item3);
		order2.addItem(item1);
		
		order3.addItem(item2);
		order3.addItem(item4);
		
		order4.addItem(item4);
		order4.addItem(item3);
		
		order5.addItem(item1);
		order5.addItem(item2);
		
		// Set some orders to true
		order1.setReady(false);
		order2.setReady(true);
		order3.setReady(false);
		order4.setReady(true);
		order5.setReady(true);
		
		// Display order details, total order price and order status
		order1.display();
		System.out.println("Total: " + order1.getOrderTotal());
		order1.getStatusMessage();
		
		order2.display();
		System.out.println("Total: " + order2.getOrderTotal());
		order2.getStatusMessage();
		
		order3.display();
		System.out.println("Total: " + order3.getOrderTotal());
		order3.getStatusMessage();
		
		order4.display();
		System.out.println("Total: " + order4.getOrderTotal());
		order4.getStatusMessage();
		
		order5.display();
		System.out.println("Total: " + order5.getOrderTotal());
		order5.getStatusMessage();
	}

}
