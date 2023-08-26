// 5. Write a program that displays the results of a series of 10 coin tosses. Use
// Math.random() function to generate a number between 0 and 1. After each coin toss,
// display whether the toss represents ‘heads’ or ‘tails’. If the result is 0.5 or less, the
// result represents ‘heads’; otherwise, it represents ‘tails’.

public class Main {
   public static void main(String[] args) {
      int i;
      for (i = 0; i < 10; i++) {
         if (Math.random() < 0.5) {
            System.out.println("Heads");
         } else {
            System.out.println("Tails");
         }
      }
   }
}