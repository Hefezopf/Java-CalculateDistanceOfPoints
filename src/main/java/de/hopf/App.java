package de.hopf;

public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Start App...");

		Point pA = new Point(1, 1);
		Point pB = new Point(1, 3);
		Point pC = new Point(4, 4);
		Point pD = new Point(6, 1);
		
		Point[] points = {pA, pB, pC, pD};
		double minDistanceOfArray = Point.determineMinimumOfArray(points);
		
		System.out.println("Minimum distance of all points = "+ minDistanceOfArray);
    }
}
