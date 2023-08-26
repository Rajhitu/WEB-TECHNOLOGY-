// 8. Write a program that prompts the user to input two numbers, first and diff. The
// program then creates a one dimensional array of 10 elements and initializes them with
// an arithmetic sequence. The first number of the sequence is the first value and the
// next number is generated by adding the diff to the number preceding it. This formula
// is repeated for the rest of the sequence. E.g. if first =11 and diff = 4, then the
// arithmetic sequence will be 11, 15, 19, 23, 27, 31 ... and so on.

import java.util.*;

public class Q8other {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first- ");
        int first = sc.nextInt();
        System.out.print("Enter diff- ");
        int diff = sc.nextInt();
        int array[] = new int[10];
        array[0] = first;
        for (int i = 1; i < 10; i++) {
            array[i] = array[i - 1] +
                    diff;
        }
        System.out.println("The arithematic sequence is:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]);
            if (i != 9) {
                System.out.print(",");
            }
        }
    }
}
