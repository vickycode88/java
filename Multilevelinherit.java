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

class grandchild extends child {

    void grandchildproperty(){
        System.out.println("grand child property");

    }
}


public class Multilevelinherit {
    public static void main(String[] args) {
        
        grandchild g = new grandchild();

        g.grandchildproperty();
        g.childproperty();
        g.parentproperty();
        
    }
}
