// 3. Define an interface with three methods - earnings(). deductions() and bonus) and define a Java class,Manager" which uses this interface without implementing bonus() method. Also define another Java class ,Substaff" which extends from Manager" class and implements bonus() method. Write the complete program to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as per the following guidelines -

// earnings→basic +DA (80% of basic) + HRA (15% of basic)
// deduction PF -12% of basic
// bonus -50% of basic

import java.util.Scanner;

interface Payment {
    void deduction(int a);

    void bonus(int b);

    void earning(int c);
}

class Manager implements Payment {

    double bs, da, hra, earning_val, deduction_val,
            bonus_val;

    

    public void earning(int bs) {
        earning_val = bs + 0.8 * bs + 0.15 * bs;
        System.out.println("Earning =" + earning_val);
    }

    public void deduction(int bs) {
        deduction_val = 0.12 * bs;
        System.out.println("Deduction =" + deduction_val);
    }

    public void bonus(int a) {
    }
}

class Substaff extends Manager {
    public void bonus(int bs) {
        bonus_val = 0.12 * bs;
        System.out.println("Bonus =" + bonus_val);
    }
}

class q3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int bs;
        System.out.println("enter your basic salary");
        bs = in.nextInt();
        Manager ob1 = new Manager();
        ob1.earning(bs);
        ob1.deduction(bs);
        Substaff ob2 = new Substaff();
        ob2.bonus(bs);
    }
}
