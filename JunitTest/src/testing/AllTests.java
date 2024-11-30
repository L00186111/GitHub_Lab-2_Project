package testing;

import org.junit.platform.suite.api.SelectClasses; // Import to specify which test classes to include in the suite
import org.junit.platform.suite.api.Suite; // Import to define a test suite

/**
 * A test suite that aggregate multiple test classes.
 * This suite rubs all test cases from the 'squareUnit' and 'sumUnit' test classes.
 */
@Suite
@SelectClasses({ squareUnit.class, sumUnit.class }) // Specifies the test classes to include in the suite
public class AllTests {
	// This class is used as a test suite entry point and does not require additional implementation
}
