package de.hopf;

import junit.framework.TestCase;

/**
 * Unit test for PointUtil.
 */
public class PointUtilTest extends TestCase {

	Point pA = new Point(1, 1);
	Point pB = new Point(1, 3);
	Point pC = new Point(4, 4);
	Point pD = new Point(6, 1);

	public void testParseAllCoords() {
		String[] coords = { "(4,3)", "(5,2)", "(1,1)", "(1,2)" };

		Point[] res = PointUtil.parseAllCoords(coords);

		assertEquals(4, res.length);
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

		int[] res = PointUtil.parseToCoord(coords);

		assertEquals(2, res.length);
		assertEquals(4, res[0]);
		assertEquals(3, res[1]);
	}

	public void testParseToCoord2() {
		String coords = "(4 3)";

		int[] res = PointUtil.parseToCoord(coords);

		assertEquals(2, res.length);
		assertEquals(4, res[0]);
		assertEquals(3, res[1]);
	}

	public void testDetermineDistance1() {
		assertEquals(1.4142135623730951, PointUtil.determineDistance(new Point(1, 1), new Point(2, 2)));
	}

	public void testDetermineDistance2() {
		assertEquals(2.0, PointUtil.determineDistance(new Point(1, 1), new Point(3, 1)));
	}

	public void testDetermineMaximumOfArray1() {
		Point[] points = { pA, pB, pC };

		assertEquals(4.24, PointUtil.determineMaximumOfArray(points));
	}

	public void testDetermineMaximumOfArray2() {
		Point[] points = { pA, pB, pC, pD };

		assertEquals(5.39, PointUtil.determineMaximumOfArray(points));
	}

	public void testDetermineMaximumOfArray3() {
		Point[] points = { pA, pC, pD };

		assertEquals(5.0, PointUtil.determineMaximumOfArray(points));
	}

	public void testDetermineMinimumOfArray1() {
		Point[] points = { pA, pC, pD };

		assertEquals(3.61, PointUtil.determineMinimumOfArray(points));
	}

	public void testDetermineMinimumOfArray2() {
		Point[] points = { pA, pB, pC, pD };

		assertEquals(2.0, PointUtil.determineMinimumOfArray(points));
	}
}
