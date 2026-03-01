package javaFundamentals;

public class PizzaPalace {

	public static void main(String[] args) {
		
		String welcomeMessage = "Welcome to Pizza Palace, "; 
		String readyMessage = "is ready to pick up!"; 
		String pendingMessage = "Your order is waiting to be served.";
		String displayTotalMessage = "Your order total: ";
		
		double pepperoniPizza = 10.99;
		double veggiePizza = 11.49;
		double cheesePizza = 7.99;

		String anna = "Anna"; 
		String mark = "Mark"; 
		String lisa = "Lisa"; 
		String kevin = "Kevin";
		
		boolean isOrderReadyAnna = false;
		boolean isOrderReadyMark = true;
		boolean isOrderReadyLisa = true; 
		boolean isOrderReadyKevin = false;
		
		//Greet Anna
		System.out.println(welcomeMessage + anna + ".");
		if(isOrderReadyAnna) {
			System.out.println("Pepperoni Pizza " + readyMessage);
		} else {
			System.out.println(pendingMessage);
		}
		
		//Marks total
		double markTotalOrder = cheesePizza * 2;
		System.out.println("\nMark's total order is: $" + markTotalOrder);
		
		if (isOrderReadyMark) {
			System.out.println("Cheese Pizza " + readyMessage);
		} else {
			System.out.println(pendingMessage);
		}
		
		//Lisa's order
		if(isOrderReadyLisa) {
			System.out.println("\nVeggie Pizza " + readyMessage);
			
			double lisaTotalOrder = veggiePizza;
			System.out.println("Lisa's total order is: $" + lisaTotalOrder);
		}else {
			System.out.println(pendingMessage);
		}
		
		//Kevin’s correction
		double correctAmmount = veggiePizza - cheesePizza;
		System.out.println("\nYou were charged for a Cheese Pizza. \nYou need to add $" + correctAmmount + " to cover the Veggie Pizza price.");
		
	}

}
