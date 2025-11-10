public class Constructor {

    String name;
    int age;
    // Constructor(){
    //     System.out.println("I am Default Construcutor");
    // }

    Constructor(String name){
        
        System.out.println("I am Single Parameter Constructor"+name);

    }

    public static void main(String[] args) {
        
        Constructor a = new Constructor("Iron-Man");
    }
}
