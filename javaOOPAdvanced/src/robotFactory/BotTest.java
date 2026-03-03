package robotFactory;

public class BotTest {

	public static void main(String[] args) {
		
		/* --- Worker Bot Operations --- */
		WorkerBot workerBot = new WorkerBot();

		workerBot.liftCrate();
		workerBot.liftCrate();
		System.out.println();
		
		workerBot.assemblePart();
		workerBot.assemblePart();
		workerBot.assemblePart();
		System.out.println();
		
		workerBot.chargeBattery();
		System.out.println(workerBot.displayEnergy());
		System.out.println();
		
		/* --- Security Bot Operations --- */
		SecurityBot securityBot = new SecurityBot();
		
		securityBot.patrol();
		securityBot.patrol();
		System.out.println();
		
		securityBot.soundAlarm();
		System.out.println();
		
		securityBot.recharge();
		System.out.println(securityBot.displayEnergy());
		

	}

}
