// 4.	Write a program in java to define a class Shape which has data member area and a member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle.

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

    int l = 5, b = 3;

    float area;

    void area(int x, int y) {

        area = (float) l * b;
    }

    void showarea() {

        System.out.println("area of rectangle is " + area);
    }
}

 public class q4

{
    public static void main(String[] args) {

        circle m = new circle();
        m.area(20);
        m.showarea();

        rectangle a = new rectangle();
        a.area(20, 40);
        a.showarea();

    }
}
