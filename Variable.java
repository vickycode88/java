class Shield {
    // instance variable
    String f_name = "Thor";
    int age = 200;

    // static variable
    static int year = 2025;
    static int earth=617;

    // instance method

    void loky() {
        System.out.println("my name is : " + f_name);
        System.out.println("My age is : " + age);
    }

    // static method

    static void something() {

        System.out.println("My birth year is : " + year);
    }
}

public class Variable {
    public static void main(String[] args) {
        // creating object of Shield class
        Shield a = new Shield();

        // accessing instance method
        a.loky();

        // accessing instance variable
        System.out.println("my friend name is : " + a.f_name);

        // accessing static varible but this is not right way.
        a.earth = 618;
        // preffered way to accessing static variable
        Shield.earth = 616;

        System.out.println("hi i am coming from earth : " + Shield.earth);
        System.out.println("hi i am coming from earth : " + a.earth);

        // accessing static method from different class static method
        Shield.something();

        // accessing static method from same class
        rocket();

    }

    // static method in same class
    static void rocket() {
        System.out.println("hi i am Rocket.....");
    }
}
