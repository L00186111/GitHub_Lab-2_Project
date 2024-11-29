/**
 * This class contains a unit test for the 'square' method in the 'mainTesting' class.
 * It uses Junit 5 to validate the correction of the method.
 */
package testing;

import static org.junit.jupiter.api.Assertions.*; //Import Jnit assertion methods

import org.junit.jupiter.api.Test; //Imports Junit for test methods

/**
 * A Junit test class for testing the 'square' method in the 'mainTesting' class.
 */
public class squareUnit {

/**
* Test method for {@link testing.mainTesting#square(int)}.
* This method tests the functionality of the 'square' method by providing a sample input(4)
* and checking if the method returns the expected output (16).	
*/
	@Test
	public void test() {
		// Create an instance of the mainTesting class
		mainTesting obj1 = new mainTesting();
		
		//call the 'square' method with input 4
		int output_f = obj1.square(4);
		
		//Assert that the returned value is 16
		assertEquals(16,output_f);
	}

}
