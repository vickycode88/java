// class Object {
//     void mission() {
//         System.out.println("mission accomplished......");
//     }
// }

// class InnerObject {
//     public static void main(String[] args) {
//         Object a = new Object();
//         a.mission();
//     }
// }


class A{
int x=4;
    static void  two(){
        System.out.println("hello");

    }
}

class B {

    public static void main(String[] args) {
        A n = new A();
        System.out.println(n.x);
        A.two();

    }
    
}