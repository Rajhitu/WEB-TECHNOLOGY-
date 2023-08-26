// 2. WAP to Create a class Employee with data members empid, name and salary.
// Use inp() to take the input of the employee and use disp() to print the employee
// details. Create 3 objects of employees and display their details.

class employee {
    int empid;
    String name;
    int salary;

    void input(String nam, int eid, int sal) {

        name = nam;
        empid = eid;
        salary = sal;
    }

    void display() {
        System.out.println("name-->" + name);
        System.out.println("name-->" + empid);
        System.out.println("name-->" + salary);
        System.out.println("  ");

    }
}

class q2_employee {

    public static void main(String[] args) {

        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();

        e1.input("hitu", 1010, 200000);
        e2.input("ramana", 2010, 400000);
        e3.input("adaarsh", 3010, 300000);

        e1.display();
        e2.display();
        e3.display();
    }
}
