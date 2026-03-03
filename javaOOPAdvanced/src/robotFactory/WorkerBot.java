package robotFactory;

public class WorkerBot extends Robot{
	
	/**
     * DOCU: Handles the heavy lifting by deducting energy and logging the action.
     * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void liftCrate() {
        this.energyLevel -= 15;
        System.out.println("Bot lifting crate.");
    }
    
    /**
     * DOCU: Reduces energy by 20 and logs action.
     * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void chargeBattery() {
        this.energyLevel += 20;
        System.out.println("Bot is charging.");
    }
    
    /**
     * DOCU: Reduces energy by 10 and logs the action.
     * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void assemblePart() {
        this.energyLevel -= 10;
        System.out.println("Bot assembling part...");
    }
}
