package jarvis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JarvisAssistant {

	public String basicGreeting() {
		return "Greetings, Sir. How may I assist you today?";
	}
	
	public String guestGreeting(String name) {
		return String.format("Hello %s. How may I assist you?", name);
	}
	
	public String guestGreeting(String name, String dayPeriod) {
		switch (dayPeriod) {
			case "morning":
				return String.format("Good %s %s! How may I help you today?", dayPeriod, name);
			case "afternoon": 
				return String.format("Good %s %s! How may I help you today?", dayPeriod, name);
			case "evening":
				return String.format("Good %s %s! How may I help you today?", dayPeriod, name);
			default:
				return "I don't quite understand";
		}
	}
	
	public String guestGreeting() {
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		
		String formmatedDate = dateFormatter.format(now);
		return String.format("It is now %s",formmatedDate);
	}
	
	public String dateAnnouncement() {
		Date date = new Date();
		return "Sir, it is currently " + date;
	}
	
	public void respondBeforeFriday(String conversation) {
		String input = conversation.toLowerCase(); 
		
		switch (input) {
			case "Friday":
				System.out.println("Right away, Sir. Although she’s still learning.");
				break;
			case "Jarvis":
				System.out.println("At your service, Sir.");
				break;
			default:
				System.out.println("Very well. Carry on.");
				break;
		}
	}
	
	public String jarvisMood(String mood) {

	    String input = mood.toLowerCase(); 

	    switch (input) {
	        case "angry":
	            String roar = "don't make me angry, you wouldn't like me when I'm angry!";
	            return roar.toUpperCase(); 

	        case "cheerful":
	            String greeting = "At your service, sir! How can I help today?";
	            return greeting; 

	        case "tired":
	            String sleepy = "I REALLY NEED TO RECHARGE MY BATTERIES...";
	            return sleepy.toLowerCase(); 
	        default:
	            return "Systems operational. Current mood: Neutral.";
	    }
	}
	
}
