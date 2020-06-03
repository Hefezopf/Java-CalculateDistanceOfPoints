package de.hopf;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PointUtil {

	public static Point[] parseAllCoords(String[] allCoords) {
		Point[] points;
		List<Point> pointsList = new ArrayList<Point>();

		for (String coord : Arrays.asList(allCoords)) { // "(4,3)", "(5,2)", ...
			int[] xy = PointUtil.parseToCoord(coord);
			pointsList.add(new Point(xy[0], xy[1]));
		}
		points = new Point[pointsList.size()];
		points = pointsList.toArray(points);

		return points;
	}

	public static int[] parseToCoord(String coords) { // "(4,3)"
		int[] res = new int[2];

		res[0] = coords.charAt(1) - 48;
		res[1] = coords.charAt(3) - 48;

		return res;
	}

	public static double determineDistance(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	}

	public static double determineMaximumOfArray(Point[] points) {
		if (points.length < 1) {
			throw new IllegalArgumentException("too less points");
		}
		double max = 0;
		for (int i = 0; i < points.length; i++) {
			Point startPoint = points[i];
			if (startPoint == null) {
				throw new IllegalArgumentException("startPoint is null");
			}
			max = calculateMaximum(points, startPoint, max, i);
		}

		return limitValue(max, 2);
	}

	public static double determineMinimumOfArray(Point[] points) {
		if (points.length < 1) {
			throw new IllegalArgumentException("too less points");
		}
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < points.length; i++) {
			Point startPoint = points[i];
			if (startPoint == null) {
				throw new IllegalArgumentException("startPoint is null");
			}
			min = calculateMinimum(points, startPoint, min, i);
		}

		return limitValue(min, 2);
	}

	private static double limitValue(double value, int digits) {
		double erg = 0;
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
		nf.setMinimumFractionDigits(digits);
		nf.setMaximumFractionDigits(digits);
		try {
			String s = nf.format(value);
			Double ergAsObj = new Double(s);
			erg = ergAsObj.doubleValue();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return erg;
	}

	private static double calculateMaximum(Point[] points, Point startPoint, double max, int startVal) {
		for (int i = startVal + 1; i < points.length; i++) {
			double maxTemp = determineDistance(startPoint, points[i]);
			if (maxTemp > max) {
				max = maxTemp;
			}
		}

		return max;
	}

	private static double calculateMinimum(Point[] points, Point startPoint, double min, int startVal) {
		for (int i = startVal + 1; i < points.length; i++) {
			double minTemp = determineDistance(startPoint, points[i]);
			if (minTemp < min) {
				min = minTemp;
			}
		}

		return min;
	}
}
