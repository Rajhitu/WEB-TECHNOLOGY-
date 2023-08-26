import java.util.*;
public class q2 {r
    public static void main(Sting[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st rational number: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter 2nd rational number: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Rational r1 = new Rational(x1,y1);
        Rational r2 = new Rational(x2,y2);
        Rational r3 = new Rational(x1,y1);
        Rational r4 = new Rational(x2,y2);
        Rational r5 = new Rational(x1,y1);
        Rational r6 = new Rational(x2,y2);
        Rational r7 = new Rational(x1,y1);
        Rational r8 = new Rational(x2,y2);
        System.out.println("Addition");
        r1.add(r2);
        r1.show();
        System.out.println("Substraction");
        r3.sub(r4);
        r3.show();
        System.out.println("Multiplication");
        r5.multi(r6);
        r5.show();
        System.out.println("Division");
        r6.div(r7);
        r6.show();
        System.out.println("Equality");
        if(r7.equal(r8))
        {
            System.out.println("Yes they are equal");
        }
        else
        {
            System.out.println("No they aren't equal");
        }
        sc.close();
    }
}
class Rational {
    int num,denum;
    Rational(int n,int d){
        num = n;
        denum = d;
    }
    Rational(){
        num = 0;
        denum = 1;
    }
    Rational add(Rational r){
        this.num = (this.num * r.denum)+(this.denum*r.num);
        this.denum = this.denum * r.denum;
        return this;
    }
    Rational sub(Rational r){
        this.num = (this.num * r.denum)-(this.denum*r.num);
        this.denum = this.denum * r.denum;
        return this;
    }
    Rational multi(Rational r){
        this.num = this.num *r.num;
        this.denum = this.denum*r.denum;
        return this;
    }
    Rational div(Rational r){
        this.num = this.num * r.denum;
        this.denum = this.denum*r.num;
        return this;
    }
    boolean equal(Rational r){
        if(((float)this.num/this.denum) == ((float)r.num/r.denum))
            return true;
        else
            return false;
    }
    void show(){
        System.out.println("Output=> "+num+"/"+denum);
    }
}