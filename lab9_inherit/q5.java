// 5. Write a program to create an Account class containing acc_no, balance as data
// members and disp() to display the details. Inherit it in Person class with all mentioned
// data members and functions. Person class also has name and aadhar_no as extra data
// members of its own. Override disp() function. Create 5 persons’ details.
class Account {
    int accno=200, bal=2000;

    void display() {

        System.out.println("account no is --->" + accno);
        System.out.println("balance  is --->" + bal);
    }

}

class person extends Account {
    String  name ;
    int adharno=32131211;
    void input(String na,int add)
    {
        name=na;
        adharno=add;
    }

    void display() {

        System.out.println("name no is --->" + name);
        System.out.println("adhar no. is  is --->" + adharno);
        super.display();
        System.out.println();
    }
    

}

public class q5 {
    public static void main(String[] args)
     {
          for (int i = 0; i < 5; i++) 
          {
            person a= new person();
            a.input("hitu",(i+2*2234));
            a.display();
          }
         

    }

}
