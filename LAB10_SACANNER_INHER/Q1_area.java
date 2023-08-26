
// 1. Write a program in java to define a class Shape which has data member 'area' and a member function show Area(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle.
import java.util.Scanner;

class shape {

    void area() {
        System.out.println("the is use to calculate area method");
    }

    void showarea() {
        System.out.println("this the use to siplay area");

    }
}

class circle extends shape {

    int r = 20;
    float area;

    void area(int x) {

        area = (float) 3.14 * x * x;
    }

    void showarea() {

        System.out.println("area of circle is " + area);
    }
}

class rectangle extends shape {

    float area;

    void area(int x, int y) {

        area = (float) x * y;
    }

    void showarea() {

        System.out.println("area of rectangle is " + area);
    }
}

public class Q1_area

{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        circle m = new circle();
        System.out.println("enter the radius of circle");
        int rad = sc.nextInt();
        m.area(rad);
        m.showarea();

        rectangle a = new rectangle();
        System.out.println("enter the length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        a.area(l, b);
        a.showarea();

    }
}
