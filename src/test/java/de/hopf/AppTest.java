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
		assertEquals(1.4142135623730951, Point.determineMinimum(new Point(1,1), new Point(2,2)));
	}

	public void testDetermineMinimumOfArray1() {
		Point pA = new Point(1, 1);
		Point pB = new Point(4, 4);
		Point pC = new Point(6, 1);
		
		Point[] points = {pA, pB, pC};	
		
		assertEquals(3.605551275463989, Point.determineMinimumOfArray(points));
	}
	
	public void testDetermineMinimumOfArray2() {
		Point pA = new Point(1, 1);
		Point pB = new Point(1, 3);
		Point pC = new Point(4, 4);
		Point pD = new Point(6, 1);
		
		Point[] points = {pA, pB, pC, pD};	
		
		assertEquals(2.0, Point.determineMinimumOfArray(points));
	}
}
