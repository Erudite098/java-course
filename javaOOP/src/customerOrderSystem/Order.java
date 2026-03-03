package customerOrderSystem;

import java.util.ArrayList;

public class Order {

	/* MEMBER VARIABLES */
	private String name;
	private boolean ready;
	private ArrayList<Item> items;
	final private static String DEFAULT_NAME = "Guest";
	
	/* CONSTRUCTOR */
	public Order() {
		this(DEFAULT_NAME);	
	}
	
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	/* GETTERS & SETTERS */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isReady() {
		return ready;
	}
    
    public void setReady(boolean ready) {
  		this.ready = ready;
  	}
    
    public ArrayList<Item> getItems() {
		return items;
	}
    
    public void setItem(ArrayList<Item> items) {
		this.items = items;
	}
    
    /* METHODS */
    
    /**
     * DOCU: Adds a new Item object to the order's item list.
     * @param {Item} item - The item to be added to the collection.
     * * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * DOCU: Prints a message to the console regarding the order's current readiness state.
     * If ready, it updates the status and notifies the user; otherwise, it asks for patience.
     * * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public void getStatusMessage() {
    	
    	String message = isReady()? "Your order is ready." : "Thank you for waiting. Your order will be ready soon.";
    	System.out.println(message);
    }

    /**
     * DOCU: Calculates the total price of all items currently in the order.
     * @returns {double} - The sum of the prices of all items in the list.
     * * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public double getOrderTotal() {
        double total = 0;
        
        for (Item item : items) {
            total += item.getPrice();
        }
        
        return total;
    }

    /**
     * DOCU: Displays the customer's name and a detailed list of all items with their prices.
     * * Last Updated: 2026-02-28
     * Author: Kerzania
     */
    public void display() {
        System.out.printf("\nCustomer name: %s\n", this.name);
        
        for (Item item : items) {
            System.out.printf("%s - $%s\n", item.getName(), item.getPrice());
        }
    }
}
