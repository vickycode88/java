class A{

    A(int x){

        System.out.println("A class is called"+ x);
    }

        String color = "Black";

    void show(){
        System.out.println("A class is called");
    }
}




class B extends A {
    B() {
        super(100); // must call explicitly
        System.out.println("Child constructor");
    }
}

   
    void show(){
        System.out.println("B is called ");
    }

    private void Super(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Super'");
    }



public class Super {
  


    public static String color;

    public static void main(String[] args) {

           B b = new B();
           b.show();


        
    }
    
}
