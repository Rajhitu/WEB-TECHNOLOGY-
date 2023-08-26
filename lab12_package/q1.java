// 1. Define two packages as - General and Marketing. In General package define a class ,employee" with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as earnings → basic +DA (80% of basic) + HRA (15% of basic)

// In Marketing package define a class ,sales" which is extending from employee" class and has a method tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id.
import java.util.Scanner;
import marketing.*;

public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scan.next();
        System.out.println("Enter empid");
        int id = scan.nextInt();
        System.out.println("Enter basic salary");
        int basic = scan.nextInt();
        sales s = new sales(name, id);
        s.printdetails();
        System.out.println("Earnings");
        System.out.println(s.earnings(basic));
        System.out.println("Travel allowance");
        System.out.println(s.tallowance(basic));
        scan.close();
    }
}