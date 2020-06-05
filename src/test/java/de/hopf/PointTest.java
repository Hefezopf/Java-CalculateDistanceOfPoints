package de.hopf;

import junit.framework.TestCase;

/**
 * Unit test for Point.
 */
public class PointTest extends TestCase {

	public void testParseToCoord1() {
		Point point = new Point(1, 2);

		assertEquals(1, point.x);
		assertEquals(2, point.y);
	}
}
