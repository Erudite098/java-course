package javaPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
			
//		String[] words = {"it", "is", "this", "we", "do", "how"};
//        ArrayList<String> phrase = new ArrayList<String>();
//        
//        // 1. Rearrange words into: [this, is, how, we, do, it]
//        phrase.add(words[2]);
//        phrase.add(words[1]);
//        phrase.add(words[5]);
//        phrase.add(words[3]);
//        phrase.add(words[4]);
//        phrase.add(words[0]);
//        
//        // 2. Print the phrase
//        // Expected: [this, is, how, we, do, it]
//        System.out.println(phrase);
		
		
		 ArrayList<String> snacks = new ArrayList<String>();
	        snacks.add("Apples");
	        snacks.add("Almonds");
	        snacks.add("Pretzels");
	        snacks.add("Yogurt");

	        System.out.println(snacks);

	        for(int i = 0; i < snacks.size(); i++) {
	        	System.out.println("Checking index " + i + ": " + snacks.get(i));
	            if(snacks.get(i).charAt(0) == 'A') {
	                System.out.println("Removing: " + snacks.get(i));
	            	snacks.remove(i);
	            	i--;
	                
	            }
	        }

	        System.out.println(snacks);
	    

	}

}
