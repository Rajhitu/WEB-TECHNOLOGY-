// 2. WAP to print "An object is created" everytime when you create an object of a class.
class displayobj {

    int i;

    
     displayobj()
    {
        System.out.println("AN OBJECT IS CREATED");
    }

    void display()
    {
        System.out.println("heloo");

    }
}

public class ques_2 {

    public static void main(String[] args) 
    {

        displayobj a = new displayobj();
        displayobj b = new displayobj();
        displayobj c = new displayobj();

    

       
    }
}
