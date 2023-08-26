// 4. Initialize an integer array in java and print only those elements which are greater than 10.
public class ques4 {

    public static void main(String[] args) {

        int a[] = {4, 43,21,300,400,239};// 1ST METHOD TO DECLARE AARAY

        // a[0] = 11;    2ND METHOD
        // a[1] = 1;
        // a[2] = 131;
        // a[3] = 141;
        // a[4] = 3;
        // a[5] = 001;
        // a[6] = 7;
        for (int i:a)
         {
            if (i > 10)
                System.out.println(i);
        }
    }

}
