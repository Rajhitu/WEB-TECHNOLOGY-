
// 3. WAP to print "This is th object created" when an object will be created (Note: it will print the no. of object created, hint: parameterized constructor)
class display{

static int i=0;

display()
{
    i++;
    System.out.println( i +"object created" );
}
}
public class ques3 
{
    public static void main(String[] args) 
    {

        display a = new display();
        display b = new display();
        display c = new display();

    }  
   
}
