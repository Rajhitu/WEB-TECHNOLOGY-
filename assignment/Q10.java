// 10. Implement the concept of abstract class for the following:

import java.util.*;

abstract class Q10 {
  abstract int moneyconversion();

  static class rupeetodollar extends Q10 {
    int moneyconversion() {
      return 78;
    }
  }

  static class rupeetoeuro extends Q10 {
    int moneyconversion() {
      return 85;
    }
  }

  public static void main(String args[]) {
    int x;
    System.out.println("Enter your amount in rupees:");
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    Q10 obj;
    obj = new rupeetodollar();
    System.out.println("Your amount in dollars is =" + (x / obj.moneyconversion()));
    obj = new rupeetoeuro();
    System.out.println("Your amount in euro is =" + (x / obj.moneyconversion()));
  }
}
