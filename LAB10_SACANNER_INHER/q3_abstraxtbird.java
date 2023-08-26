
// 3. Declare an abstract class Bird() having an abstract method color(). Inherit it in two child classes Crow() and Swan () and override the color() method suitably to print the color of the bird. Use dynamic method dispatch while printing the output. (Use Scanner class to take the user input in all the programs)
import java.util.Scanner;

abstract class bird
{
abstract void color();


}

class Crow extends bird
{

    void color()
    {
        System.out.println("this is color of crow class");
    }


}

class swan extends bird
{
    void color()
    {
        System.out.println("this is color of swan class");
    }



}
public class q3_abstraxtbird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bird cr = new Crow();
        cr.color();

        bird sw = new swan();
        sw.color();
    }

    
}
