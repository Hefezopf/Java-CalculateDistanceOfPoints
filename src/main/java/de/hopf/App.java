package de.hopf;

public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Start!!!");

		Point pA = new Point(1, 1);
		Point pB = new Point(1, 3);
		Point pC = new Point(4, 4);
		Point pD = new Point(6, 1);
		
		Point[] points = {pA, pB, pC, pD};

		double minDistance = Point.determineMinimum(pA, pC);
		System.out.println("Distance:"+ minDistance);
		
		double minDistanceOfArray = Point.determineMinimumOfArray(points);
		System.out.println("Distance of Array:"+ minDistanceOfArray);
    }
}
