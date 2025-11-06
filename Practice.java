// ROUGH WORK

// class New {

//     static void kaal() {
//         System.out.println("super");
//     }

//     void trans() {
//         System.out.println("i am trans");
//     }

//     void robert() {
//         trans();
//     }

// }

// public class Practice {
//     void dead() {
//         System.out.println("hi");
//     }

//     static void team() {
//         System.out.println("i am static");
//     }

//     public static void main(String[] args) {

//         Practice a = new Practice();
//         New b = new New();
//         b.robert();

//         // a.dead();

//         a.some();

//         // team();

//     }

//     static void him() {
//         System.out.println("i am new static ");
//     }

//     void some() {
//         dead();
//         him();
//         team();
//         New.kaal();
        

//     }

// }

// constructor practice
public class Practice{
    String name;
    int age;

    Practice(String na){
        this.name=na;
        // System.out.println(name);
    }

    void display(){
        System.out.println(name);
    }

   

    public static void main(String[] args) {
        // String name = "thor";
        Practice a = new Practice("thor");
        Practice b = new Practice("Loky");
        a.display();
        b.display();
        // System.out.println(a.name);
    }
}