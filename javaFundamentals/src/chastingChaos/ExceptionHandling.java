package chastingChaos;

import java.util.ArrayList;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		
		for (int i = 0; i < myList.size(); i++) {
			try {
				Integer castedValue = (Integer) myList.get(i); // This will cause trouble!
				System.out.println("\nSuccesful casting\nValue at index " + i + " is: " + castedValue);
			} catch (ClassCastException e) {
				System.out.println("\nError: " + e);
                System.out.println("At index: " + i);
                System.out.println("Offending value: " + myList.get(i));   
			}
			
		    
		}

	}

}
