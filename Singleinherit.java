class parent {

    void parentproperty() {

        System.out.println("parent property");
    }
}

class child extends parent {
    void childproperty() {
        System.out.println("child property");
    }
}

public class Singleinherit {

    public static void main(String[] args) {

        child c = new child();

        c.childproperty();
        c.parentproperty();

    }

}