// 2. Define an interface Motor with a data member -capacity and two methods such 
// as run() and consume(). Define a Java class,Washing machine" which implements this 
// interface and write the code to check the value of the interface data member thru an object of the class.

import java.util.Scanner;

interface motor {
    void run();

    int capacity = 100;

    void consume();
}

class washingmachine implements motor {

    Scanner input = new Scanner(System.in);
    int lt;

    public void consume() {
        System.out.println("how much water do u want to consume");
        lt = input.nextInt();
    }

    public void run() {
        if (lt > capacity) {
            System.out.println("Error,washing machine cannot run");
        } else {
            System.out.println("Okay,you can run wachine machine");
        }
    }
}

class q2 {
    public static void main(String[] args) {
        motor a = new washingmachine();
        a.consume();
        a.run();
    }
}