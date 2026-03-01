package jarvis;

public class JarvisTest {

	public static void main(String[] args) {
		
		JarvisAssistant jarvis = new JarvisAssistant();
		
		System.out.println(jarvis.basicGreeting());
		
		System.out.println(jarvis.guestGreeting("Zania"));
		System.out.println(jarvis.guestGreeting("Kz", "morning"));
		System.out.println(jarvis.guestGreeting());
		
		System.out.println(jarvis.dateAnnouncement());
		
		jarvis.respondBeforeFriday("jarvis");
		
		System.out.println(jarvis.jarvisMood("angry"));
		

		

	
	}

}
