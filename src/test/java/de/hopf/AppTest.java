package de.hopf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App.
 */
public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testDetermineMinimum() {
		assertEquals(1.4142135623730951D, Point.determineMinimum(new Point(1,1), new Point(2,2)));
	}

	public void testDetermineMinimumOfArray() {
		Point pA = new Point(1, 1);
		Point pB = new Point(1, 3);
		Point pC = new Point(4, 4);
		Point pD = new Point(6, 1);
		
		Point[] points = {pA, pB, pC, pD};	
		
		assertEquals(22.0D, Point.determineMinimumOfArray(points));
	}
}
