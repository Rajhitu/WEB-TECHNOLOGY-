// 2. Illustrate the execution of constructors in multi-level inheritance with three Java
// classes – plate(length, width), box(length, width, height), wood box (length, width,
// height, thick)


class  plate
{ int length,width;

    plate()
    {
    System.out.println("constructor od class plate");
    }

}

class box extends plate
{
    int length,width,height;
 box()
 {
     System.out.println("constructor od class box");
 }


}

class woodbox extends box
{ 
    int length,width,height,thick;
    woodbox()
    {
    System.out.println("constructor od class woodbox");
    }


}
public class q2 {
    public static void main(String[] args) {
        

        woodbox wd = new woodbox();

        // we can clearly see that the constructor of parent class is called first then the base class constructor is caleed
    }
    
}
