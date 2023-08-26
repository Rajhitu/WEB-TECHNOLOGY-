// 2. Define an interface Motor with a data member -capacity and two methods such 
// as run() and consume(). Define a Java class,Washing machine" which implements this 
// interface and write the code to check the value of the interface data member thru an object of the class.

import java.util.Scanner;

class Bit {
    int x;
  public   int b0, b1, b2, b3;

    Bit(int x) throws Exception {

        if (x == 0 || x == 1) {

        } else {

            // throw
        }

    }

    int getx() {

        return x;
    }
}

class Four_bit_binary extends Bit {

    Four_bit_binary() {

        System.out.println("this this the constructor of four bit class");

        b0 = 1;
        b1 = 2;
        b2 = 3;
        b3 = 4;
    }

    int complement(int no) {

        return ~no;

    }

void display()
{
    System.out.println("complement of"+b0 );
    System.out.println("is--->"+complement(b0));
    System.out.println("complement of" +b1 );
    System.out.println("complement of "+b2 );
    System.out.println("complementof "+b3 );

}

}

class q2 {
    public static void main(String[] args) {
        Four_bit_binary obj = new Four_bit_binary();
        obj.display();

    }
}