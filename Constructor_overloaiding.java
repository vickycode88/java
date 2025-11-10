class Avenger1 {
    String name;
    String power;
    int age;

    
    Avenger1() {
        System.out.println("Unknown Avenger created.");
    }

    
    Avenger1(String n) {
        name = n;
        System.out.println("Avenger " + name + " created.");
    }

    
    Avenger1(String n, String p, int a) {
        name = n;
        power = p;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Power: " + power + ", Age: " + age);
    }

    public static void main(String[] args) {
        Avenger1 a1 = new Avenger1(); 
        Avenger1 a2 = new Avenger1("Iron Man"); 
        Avenger1 a3 = new Avenger1("Thor", "Thunder", 1500); 
        a3.display();
    }
}