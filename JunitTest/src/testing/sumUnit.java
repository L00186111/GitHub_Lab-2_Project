/**
 * This class contains a unit test for the 'sum' method in the 'mainTesting' class.
 * It uses Junit 5 to validate the correction of the method.
 */
package testing;

import static org.junit.jupiter.api.Assertions.*; //Import Junit assertion methods

import org.junit.jupiter.api.Test; //Imports Junit for test methods

/**
 * A Junit test class for testing the 'sum' method in the 'mainTesting' class.
 */
public class sumUnit {

/**
* Test method for {@link testing.mainTesting#square(int)}.
* This method tests the functionality of the 'sum' method by providing a sample input(4 and 5)
* and checking if the method returns the expected output (9).	
*/
	@Test
	public void test() {
		
		// Create an instance of the mainTesting class
		mainTesting obj1 = new mainTesting();
		
		//call the 'square' method with input 4 and 5
		int output_f = obj1.sum(4,5);
		
		//Assert that the returned value is 9
		assertEquals(9,output_f);
	}

}
