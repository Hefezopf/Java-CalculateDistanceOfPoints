package de.hopf;

/**
 * You can also call the app the cmd params like so:
 * Calling to App with "(4,3)", "(5,2)", "(1,1)", "(1,2)"
 * Should result in:
 * Minimum distance of all points = 1.0
 * @author marku
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start App...");

		Point[] points;
		if (args.length > 0) {
			points = PointUtil.parseAllCoords(args);
		} else {
			Point[] pointsFixed = new Point[4];
			pointsFixed[0] = new Point(1, 1);
			pointsFixed[1] = new Point(1, 3);
			pointsFixed[2] = new Point(4, 4);
			pointsFixed[3] = new Point(6, 1);
			points = pointsFixed;
		}

		double minDistanceOfArray = PointUtil.determineMinimumOfArray(points);

		System.out.println("Minimum distance of all points = " + minDistanceOfArray);
	}
}
