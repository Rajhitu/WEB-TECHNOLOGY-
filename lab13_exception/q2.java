// 2. A subclass exception must appear before super-class exception. Justify this with suitable Java programs.

public class q2 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
            System.out.println("Result is: " + result);
        }
        // catch(ArithmeticException e2){
        // System.out.println("Subclass ArithmeticException Occured");
        // }
        catch (Exception e1) {
            System.out.println("Superclass Exception Occured");
        } 
        catch (ArithmeticException e2) {
            System.out.println("Subclass ArithmeticException Occured");
        }
        System.out.println("Program Ended");
    }
}