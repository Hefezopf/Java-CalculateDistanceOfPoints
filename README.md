# Java-CalculateDistanceOfPoints

The java program calculates the minimum distance of points.

Sample Coordinates: A(1, 1), B(1, 3), C(4, 4), D(6, 1) 

![Coordinates](src/main/resources/Coordinates.png "Coordinates")

<span style="color:blue">Minimum distance of all points = 2.0</span>


## Build and Test

As IDE use Visual Studio Code or Eclipse

**mvn clean install**


## Run

**mvn exec:java -Dexec.mainClass="de.hopf.App"**

Output:

>Start App...
>
>Minimum distance of all points = 2.0
>Maximum distance of all points = 5.385164807134504

or run with params

**mvn exec:java -Dexec.mainClass="de.hopf.App" -Dexec.args="(4,3) (5,2) (1,1) (1,2)"**

Calling the app with this params should result in:
 
Output:

>Start App...
>
>Minimum distance of all points = 1.0
>Maximum distance of all points = 4.123105625617661

Hint: Only use single digit numbers as point coordinates like (4,3)!


## Travis

Each commit to GitHub will result in a automated online travis CI/CD build.

https://travis-ci.com/github/Hefezopf/Java-CalculateDistanceOfPoints

