package brick;

public class Brick {
	
	// Constants
	private static final int STRENGTH_OF_GREEN = 1000;
	private static final int STRENGTH_OF_YELLOW = 5000;
	private static final int STRENGTH_OF_RED = 10000;
	
	// Instance Vars
	private String color;
	private int strengthOfThisBrick;
	
	// Ctor
	public Brick(String color) {
		this.color = color.toLowerCase();
		
		if(this.color == "green") {
			this.strengthOfThisBrick = STRENGTH_OF_GREEN;
			
		}
		else if(this.color == "yellow") {
			this.strengthOfThisBrick = STRENGTH_OF_YELLOW;
			
		}
		else {
			this.strengthOfThisBrick = STRENGTH_OF_RED;
			
		}
	}
	
	/**
	 * Get the current Strength of the brick.
	 * @return the strength of the brick.
	 */
	public int getStrength() {
		return strengthOfThisBrick;
	}
	
	/**
	 * To reduce the health of brick and ping when the brick dies.
	 * @return true if the brick is dead and false otherwise.
	 */
	public boolean takeHit() {
		strengthOfThisBrick -= 100;
		if(strengthOfThisBrick <= 0) {
			return true;
		}
		return false;
	}
	
	

}
