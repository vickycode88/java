class parent {

    void parentproperty() {

        System.out.println("parent property");
    }
}

class brother extends parent {
    void brotherproperty() {
        System.out.println("brother property");
    }
}

class sister extends parent {

    void sisterproperty() {
        System.out.println("sister property");

    }
}

public class Hierarchical {
    public static void main(String[] args) {
         brother b = new brother();
    b.brotherproperty();

    sister s = new sister();
    s.sisterproperty();
    }
   
}
