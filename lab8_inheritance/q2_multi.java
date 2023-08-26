class grandparent {

    int no;

    void granpa() {
        System.out.println("this is grandparetn class");
    }
}

class parent extends grandparent {

    int no;

    void pareent() {
        System.out.println("this is parent class");
    }
}

class child extends parent {

    int no;

    void childeren() {
        System.out.println("this is child class");
    }
}

public class q2_multi {

    public static void main(String[] args) {
        System.out.println("Created object of class child and able t acess the parent class ehich in enherited multilevel");
        child c = new child();
        c.childeren();
        c.pareent();
        c.granpa();
    }

}
