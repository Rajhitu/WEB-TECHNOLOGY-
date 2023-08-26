// 7. Write a program in Java to implement constructor overloading.

class Q7 {
  int value1;
  int value2;

  Q7() {
    value1 = 10;
    value2 = 20;
    System.out.println("Inside 1st Constructor");
  }

  Q7(int a) {
    value1 = a;
    System.out.println("Inside 2nd Constructor");
  }

  Q7(int a, int b) {
    value1 = a;
    value2 = b;
    System.out.println("Inside 3rd Constructor");
  }

  public void display() {
    System.out.println("Value1 === " + value1);
    System.out.println("Value2 === " + value2);
  }

  public static void main(String args[]) {
    Q7 d1 = new Q7();
    Q7 d2 = new Q7(30);
    Q7 d3 = new Q7(30, 40);
    d1.display();
    d2.display();
    d3.display();
  }
}
