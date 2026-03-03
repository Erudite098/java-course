package robotFactory;

public class BotTest {

	public static void main(String[] args) {
		
		/* --- Worker Bot Operations --- */
		WorkerBot workerBot = new WorkerBot();

		workerBot.liftCrate();
		workerBot.liftCrate();
		
		workerBot.assemblePart();
		workerBot.assemblePart();
		workerBot.assemblePart();
		
		workerBot.chargeBattery();
		System.out.println(workerBot.displayEnergy());
		
		
		/* --- Security Bot Operations --- */
		SecurityBot securityBot = new SecurityBot();
		
		securityBot.patrol();
		securityBot.patrol();
		
		securityBot.soundAlarm();
		
		securityBot.recharge();
		System.out.println(securityBot.displayEnergy());
		

	}

}
