class Shield {
    // instance variable
    String f_name = "Thor";
    // int age = 200;

    // static variable
    static int age = 200;

    // instance method
    // void loky(){
    // System.out.println("my name is : "+ f_name);
    // System.out.println("My age is : "+ age);
    // }

    // static method

    static void loky() {

        System.out.println("My age is : " + age);
    }
}

public class Variable {
    public static void main(String[] args) {

        Shield a = new Shield();

        // accessing instance method
        // a.loky();

        // accessing instance variable
        System.out.println("my friend name is : " + a.f_name);

        // accessing static varible
        a.age = 100;
        Shield.age = 300;

        System.out.println("my age has been changed : " + Shield.age);
        System.out.println("my age has been changed : " + a.age);

        // accessing static method from different class static method
        Shield.loky();

        // accessing static method from same class
        rocket();

    }
// static method in same class
    static void rocket() {
        System.out.println("hi i am Rocket.....");
    }
}
