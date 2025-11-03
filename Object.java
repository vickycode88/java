class Object {
    void mission(){
        System.out.println("mission accomplished......");
    }
}

class InnerObject {
    public static void main(String[] args) {
         Object a = new Object();
         a.mission();
    }
   

    
}
