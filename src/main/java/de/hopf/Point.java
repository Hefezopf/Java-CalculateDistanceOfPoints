package de.hopf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static Point[] parseAllCoords(String[] allCoords) {
		Point[] points;
		List<Point> pointsList = new ArrayList<Point>();
		for (String coord : Arrays.asList(allCoords)) { // "(4,3)", "(5,2)", ...
			int[] xy = Point.parseToCoord(coord);
			System.out.println(xy[0] + " " + xy[1]);
			pointsList.add(new Point(xy[0], xy[1]));
		}
		points = new Point[pointsList.size()];
		points = pointsList.toArray(points);		
		return points;
	}
	
	public static int[] parseToCoord(String coords) {
		int[] res = new int[2];
		
		String[] xy = coords.replaceAll("[^\\w\\d]", "").toLowerCase().split("");
		res[0] = xy[0].matches("\\d") ? Integer.parseInt(xy[0]) : xy[0].charAt(0) - 'a' + 1;
		res[1] = xy[1].matches("\\d") ? Integer.parseInt(xy[1]) : xy[1].charAt(0) - 'a' + 1;
		
		return res;
	}
	
	public static double determineMinimum(Point p1, Point p2) {		
		return Math.sqrt(Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y), 2) );
	}

	public static double determineMinimumOfArray(Point[] points) {	
		if(points.length < 1) {
			throw new IllegalArgumentException("too less points");
		}
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < points.length; i++) {
			Point startPoint = points[i];
			if(startPoint==null) {
				throw new IllegalArgumentException("");
			}
			min = calculate(points, startPoint, min, i);
		}
		
		return min;
	}

	private static double calculate(Point[] points, Point startPoint, double min, int startVal) {
		for (int i = startVal+1; i < points.length; i++) {
			double minTemp = determineMinimum(startPoint, points[i]);
			if(minTemp < min) {
				min = minTemp;
			}
		}
		return min;
	}
} 
