package javaPractice;

public class StringPractice {
    public static void main(String[] args) {
    	String name = "Kerzania";
    	int firstA = name.indexOf("a");
    	int secondA = name.indexOf("a", firstA+1);
    	
    	System.out.println(firstA);
    	System.out.println(secondA);
    	
    	String formatted = String.format("Nice to meet you %s! Your name has %d letters", name, name.length());
    	System.out.println(formatted);
    
    	
    	if (name.contains("a")) {
    		System.out.println(true);
    	}else {
			System.out.println(false);
		}
    }
}