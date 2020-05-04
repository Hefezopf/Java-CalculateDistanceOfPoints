package de.hopf;

public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
