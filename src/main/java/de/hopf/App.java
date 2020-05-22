package de.hopf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
			List<Point> pointsList = new ArrayList<Point>();
			for (String s : Arrays.asList(args)) { // "(4,3)", "(5,2)", ...
				System.out.println(s);
				int[] xy = parseToCoord(s);
				System.out.println(xy[0] + " " + xy[1]);
				pointsList.add(new Point(xy[0], xy[1]));
			}
			points = new Point[pointsList.size()];
			points = pointsList.toArray(points);

		} else {
			Point[] pointsFixed = new Point[4];
			pointsFixed[0] = new Point(1, 1);
			pointsFixed[1] = new Point(1, 3);
			pointsFixed[2] = new Point(4, 4);
			pointsFixed[3] = new Point(6, 1);
			points = pointsFixed;
		}

		double minDistanceOfArray = Point.determineMinimumOfArray(points);

		System.out.println("Minimum distance of all points = " + minDistanceOfArray);
	}

	private static int[] parseToCoord(String s) {
		String[] xy = s.replaceAll("[^\\w\\d]", "").toLowerCase().split("");
		int[] res = new int[2];
		res[0] = xy[0].matches("\\d") ? Integer.parseInt(xy[0]) : xy[0].charAt(0) - 'a' + 1;
		res[1] = xy[1].matches("\\d") ? Integer.parseInt(xy[1]) : xy[1].charAt(0) - 'a' + 1;
		return res;
	}
}
