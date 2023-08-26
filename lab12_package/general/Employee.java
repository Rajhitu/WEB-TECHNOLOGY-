package general;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(String name, int id) {
        ename = name;
        empid = id;
    }

    public double earnings(int basic) {
        double earn = basic + (0.8 * basic) + (0.15 * basic);
        return earn;
    }

    public void printdetails() {
        System.out.println("Employee name");
        System.out.println(ename);
        System.out.println("Employee id");
        System.out.println(empid);
    }
}