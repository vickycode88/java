abstract class A {

    String name;

    void rocket(String name) {

        System.out.println("i am rocket");

    }

    abstract void fantastic();
}

class Thor extends A {

    void antman() {
        System.out.println("i am ant-man");
    }

    void fantastic() {
        System.out.println("fantastic 4");
    }

}

class Iron extends Thor {

    void fantastic() {
        System.out.println("hey palnet earth");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Iron i = new Iron();
        i.fantastic();

    }

}
