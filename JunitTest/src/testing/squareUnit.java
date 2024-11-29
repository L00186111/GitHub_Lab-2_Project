/**
 * 
 */
package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class squareUnit {

	/**
	 * Test method for {@link testing.mainTesting#square(int)}.
	 */
	@Test
	public void test() {
		mainTesting obj1 = new mainTesting();
		int output_f = obj1.square(4);
		//Test the output
		assertEquals(16,output_f);
	}

}
