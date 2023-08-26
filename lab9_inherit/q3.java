// 3. Program on Dynamic Method Dispatch.
import java.util.Scanner;



class trees {

    int no;

    void tree() {
        System.out.println("this is tree class");
    }
}

class mango extends trees {

    int no;

    void tree() {
        System.out.println("this is mango class");
    }
}

class apple extends mango {

    int no;

    void tree() {
        System.out.println("this is appple class");
    }
}

public class q3

{
    public static void main(String[] args) {
int x;
        Scanner sc=new Scanner(System.in);

        System.out.println("from the object of apple class and mangoclass acceesing method of tree class ehich is inherited hierachial");
        mango m = new apple();
        m.tree();
        
        trees a= new mango();
        a.tree();
        

    }
}



