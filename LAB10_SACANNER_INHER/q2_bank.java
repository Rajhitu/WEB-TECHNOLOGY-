
// 2. Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. Inherit it in Person class with all mentioned data members and functions. Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 5 persons' details.
import java.util.Scanner;

class Account {
    int accno = 200, bal = 2000;

    void display() {

        System.out.println("account no is --->" + accno);
        System.out.println("balance  is --->" + bal);
    }

    void inputac(int aca, int baaa) {
        accno = aca;
        bal = baaa;
    }

}

class person extends Account {
    String name;
    int adharno;

    void input(String na, int add) {
        name = na;
        adharno = add;
    }

    void display() {

        System.out.println("name no is --->" + name);
        System.out.println("adhar no. is  is --->" + adharno);
        super.display();
        System.out.println();
    }

}

public class q2_bank {
    public static void main(String[] args) {
        String namee;
        int adhar, acc, bal;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            person a = new person();

            System.out.println("enter the naem and addhar accno and bal");
            namee = sc.nextLine();
            adhar = sc.nextInt();
            acc = sc.nextInt();
            bal = sc.nextInt();
            sc.nextLine();

            a.input(namee, adhar);
            a.inputac(acc, bal);
            a.display();
        }

    }

}
