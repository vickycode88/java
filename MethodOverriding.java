class Rocket {
    void attack() {
        System.out.println("Avenger attacks!");
    }
}

class IronMan extends Rocket {
    void attack() { System.out.println("Iron Man attacks with lasers!"); }
}

class Thor extends Rocket {
    void attack() { System.out.println("Thor attacks with lightning!"); }
}

class Hulk extends Rocket {
    void attack() { System.out.println("Hulk smashes everything!"); }
}


public class MethodOverriding {
    
    public static void main(String[] args) {
        Rocket a;

        a = new IronMan(); 
        a.attack();  

        a = new Thor();
        a.attack(); 

        a = new Hulk();    
        a.attack();  

    }
}