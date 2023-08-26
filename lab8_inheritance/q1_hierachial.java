class tree {

    int no;

    void trees() {
        System.out.println("this is tree class");
    }
}

class mango extends tree {

    int no;

    void mangotree() {
        System.out.println("this is mango class");
    }
}

class apple extends tree {

    int no;

    void appletree() {
        System.out.println("this is appple class");
    }
}

public class q1_hierachial

{
    public static void main(String[] args) {
        System.out.println("from the object of apple class and mangoclass acceesing method of tree class ehich is inherited hierachial");
        apple a = new apple();
        a.appletree();
        a.trees();
        mango m = new mango();
        m.mangotree();
        m.trees();

    }
}
