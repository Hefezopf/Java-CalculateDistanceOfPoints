package de.hopf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App.
 */
public class PointTest extends TestCase {

	public PointTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(PointTest.class);
	}

	public void testParseAllCoords() {
		String[] coords = {"(4,3)", "(5,2)", "(1,1)", "(1,2)"};
		
		Point[] res = Point.parseAllCoords(coords);
		
		assertEquals(44, res.length);
		assertEquals(4, res[0].x);
		assertEquals(3, res[0].y);
		assertEquals(5, res[1].x);
		assertEquals(2, res[1].y);
		assertEquals(1, res[2].x);
		assertEquals(1, res[2].y);
		assertEquals(1, res[3].x);
		assertEquals(2, res[3].y);
	}

	public void testParseToCoord1() {
		String coords = "(4,3)";
		
		int[] res = Point.parseToCoord(coords);
		
		assertEquals(2, res.length);
		assertEquals(4, res[0]);
		assertEquals(3, res[1]);
	}
	
	public void testParseToCoord2() {
		String coords = "(4 3)";
		
		int[] res = Point.parseToCoord(coords);
		
		assertEquals(2, res.length);
		assertEquals(4, res[0]);
		assertEquals(3, res[1]);
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
