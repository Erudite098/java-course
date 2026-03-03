package robotFactory;

public class SecurityBot extends Robot{
	
	/**
     * DOCU: Reduces energy by 20 and logs a patrol action.
     * * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void patrol() {
        this.energyLevel -= 20;
        System.out.println("Security bot is patrolling the area");     
    }
    
    /**
     * DOCU: Reduces energy by 30 and logs an alarm trigger.
     * * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void soundAlarm() {
        this.energyLevel -= 30;
        System.out.println("Alert! Alarm has been triggered."); 
    }
    
    /**
     * DOCU: Increases energy by 40 and logs a recharge event.
     * * Last Updated: 2026-03-03
     * Author: Kerzania
     */
    public void recharge() {
         this.energyLevel += 40;
         System.out.println("Security bot has been recharged.");
    }
}
