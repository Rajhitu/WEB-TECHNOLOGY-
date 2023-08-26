abstract class Demo {

    public int a;

    Demo() {

        a = 10;
    }

    abstract public void set(int a);

    abstract final public void get();

}

class TestDemo4 extends Demo {

    public void set(int a) {
        this.a = a;
    }

    final public void get() {
        System.out.print(a);
    }

    }
}


public static void main(String[] args) {
    int x=3, y=5, z=10;
 int l=  ++z + y - y + z + x++;
 System.out.println( l);      