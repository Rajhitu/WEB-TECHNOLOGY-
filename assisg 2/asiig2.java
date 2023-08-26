// Define a public class Point representing a point in 2-D coordinate system inside a package mypackage1. Also define suitable constructor(s) for the class and a list of overloaded methods distance(), distance(double x, double y), distance(Point another) that can find Euclidean distances of this point from the origin, from another point having coordinate (x, y), and from any other given Point variable another, respectively.

// Further define another public class Circle inside another package mypackage2. Class Circle have the following private member variables: a radius (double) and a centre (an instance of the previously defined Point class). Define suitable constructor(s) for the Circle class, and the following methods: a distance(Circle another) method that returns the distance from the centre of this instance to the centre of the given Circle instance (called another), and a checkWithin (Point p) method that can check whether the given point argument p is "within", "on", or "outside" this circle.

// Write Java Program(s) to implement above classes and demonstrate their use.


import mypackage1.Point;
import mypackage2.Circle;
import java.util.Scanner;

public class asiig2 {
    public static void main(String args[]) {
        double x, y, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates for a point: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point p1 = new Point(x, y);
        ans = p1.distance();
        System.out.println("Distance from origin: " + ans);
        System.out.print("Enter the coordinates for another point: ");
 

        System.out.println("Distance between first and this point: " + ans);
        double radius;
        System.out.print("Enter the coordinates of the centre and radius of a circle: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        radius = sc.nextDouble();
        Circle c1 = new Circle(x, y, radius);
        System.out.print("Enter the coordinates of the centre and radius of another circle: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        radius = sc.nextDouble();
        Circle c2 = new Circle(x, y, radius);
        ans = c1.distance(c2);
        System.out.println("Distance between circles: " + ans);
        System.out.print("Enter the coordinates for a point to check position: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point p2 = new Point(x, y);
        String ans1 = c1.checkWithin(p2);
        System.out.println("the point lies " + ans1 + " the circle.");
    }
}