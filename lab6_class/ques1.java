// 1. WAP in java to create a class Faculty having members id, name, gender and a static member college="KIIT". Change the name of the college to "KIIT-SCE" and create, initialize and print the values of three objects
class staff {

    int memid;
    String name;
    char gender;
    static String clg = "KIIT";

    static void change() {

        clg = "kIIT-SCE";
    }

    void input() {

        System.out.println("enter the id name and genger");

    }

    void display() {
        System.out.println("");
        System.out.println(+memid + " & " + name + " & " + gender + " & " + clg);
    }

}

public class ques1 {

    public static void main(String[] args) {

        staff a = new staff();
        staff b = new staff();
        staff c = new staff();

        a.memid = 111;
        a.name = "hitu";
        a.gender = 'M';

        b.memid = 114321;
        b.name = "heroo";
        b.gender = 'M';

        c.memid = 13211;
        c.name = "tonny";
        c.gender = 'M';

        staff.change();

        a.display();
        b.display();
        c.display();

    }
}
