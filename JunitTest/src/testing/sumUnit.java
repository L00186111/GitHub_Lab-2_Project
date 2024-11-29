/**
 * 
 */
package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class sumUnit {

	/**
	 * Test method for {@link testing.mainTesting#square(int)}.
	 */
	@Test
	public void test() {
		mainTesting obj1 = new mainTesting();
		int output_f = obj1.sum(4,5);
		//Test the output
		assertEquals(9,output_f);
	}

}
