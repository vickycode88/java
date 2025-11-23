class Avenger {
    void attack() {
        System.out.println("Avenger attacks!");
    }
}

class IronMan extends Avenger {
    void attack() { System.out.println("Iron Man attacks with lasers!"); }
}

class Thor extends Avenger {
    void attack() { System.out.println("Thor attacks with lightning!"); }
}

class Hulk extends Avenger {
    void attack() { System.out.println("Hulk smashes everything!"); }
}


public class MethodOverriding {
    
    public static void main(String[] args) {
        Avenger a;

        a = new IronMan(); 
        a.attack();  

        a = new Thor();
        a.attack(); 

        a = new Hulk();    
        a.attack();  

    }
}