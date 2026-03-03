package robotFactory;

public class Robot {
	
	/* --- Member Variable --- */
	protected int energyLevel = 100;
	
	/**
     * DOCU: Displays the curret energy level.
     * Last Updated: 2026-03-03
     * Author: Kerzania
     */
	public String displayEnergy() {
		return "Current energy level: " + energyLevel;

	}
}
