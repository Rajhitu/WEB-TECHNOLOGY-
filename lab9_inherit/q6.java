// 6.	Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super

class base {

    base(int x) {

        System.out.println("this is base class constructor and value is" +x);
    }
}

class derive extends base
 {
    

    derive() 
    {
        super (20);
        System.out.println("this is derive class comstrucutor");
    }

}

public class q6 {
    public static void main(String[] args) {
        derive d = new derive();
    }
}
