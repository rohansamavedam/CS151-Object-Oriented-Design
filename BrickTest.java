package brick;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrickTest {

	@Test
	void test() {
		Brick greenBrick = new Brick("green");
		Brick yellowBrick = new Brick("yellow");
		Brick redBrick = new Brick("red");
		
		assertEquals(greenBrick.getStrength(), 1000);
		assertEquals(yellowBrick.getStrength(), 5000);
		assertEquals(redBrick.getStrength(), 10000);
		
		greenBrick.takeHit();
		
		assertEquals(greenBrick.getStrength(), 900);
		
		greenBrick.takeHit();
		greenBrick.takeHit();
		greenBrick.takeHit();
		
		greenBrick.takeHit();
		greenBrick.takeHit();
		greenBrick.takeHit();
		
		greenBrick.takeHit();
		
		assertEquals(greenBrick.takeHit(), false);
		assertEquals(greenBrick.takeHit(), true);
		
		
	}

}
