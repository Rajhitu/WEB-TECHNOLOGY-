public class test

( public static void main(String [] args) (

try

(

bad Method();

System.out.print("A");

catch (RuntimeException ex) /* Line 10 */

(

System.out.print("B");

catch (Exception ex1)

( System.out.print("C");

}

finally

(

System.out.print("D");

}

System.out.print("E");

}

public static void bad Method()

throw new RuntimeException();

}