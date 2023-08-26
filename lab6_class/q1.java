
import java.lang.Math;
import java.util.Scanner;

class Point{
    int x,y;
    Point ()
    {
        x=0;
        y=0;
    }
    Point (int a, int b)
    {
        x=a;
        y=b;
    }
    Point (Point p1)
    {
        x=p1.x;
        y=p1.y;
    }
    double findDistance() 
    {
        return Math.sqrt(x*x + y*y);
    }
    double findDistance(int x1, int y1)
    {
        return Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
    }
    double findDistance(Point p1)
    {
        return Math.sqrt(Math.pow(p1.x,2) + Math.pow(p1.y,2));
    }
    void show()
    {
        System.out.println("X : "+ x +"  ,  Y : " + y);
    }
}

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates of point 1 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Point p1 = new Point(a,b);
        
        System.out.println("point 1 :");
        p1.show();

        System.out.print("\nThe Distance from origin is : ");
        System.out.println(p1.findDistance());

        System.out.println("Enter the coordinates (x y) : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("\nThe Distance from x,y is : ");
        System.out.println(p1.findDistance(x,y));

        System.out.print("Enter the coordinates of point 2 : ");
        a = sc.nextInt();
        b = sc.nextInt();
        Point p2 = new Point(a,b);

        System.out.print("\nThe Distance between p1 & p2 is : ");
        System.out.println(p1.findDistance(p2));
    }
}