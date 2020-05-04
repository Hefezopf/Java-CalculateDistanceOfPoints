package de.hopf;

public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Start!!!");

		Point p1 = new Point(1, 4);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(3, 2);
		Point p4 = new Point(4, 1);
		
		Point[] points = {p1, p2, p3, p4};

		double minDistance = Point.determineMinimum(p1, p2);
		System.out.println("Distance:"+ minDistance);
		
		double minDistanceOfArray = Point.determineMinimumOfArray(points);
		System.out.println("Distance of Array:"+ minDistanceOfArray);
    }
}
