public class Instance_para {
 void mission(String name, int age){
        System.out.println("Name of hero : " + name);
        System.out.println("my age is : "+ age);
    }
    public static void main(String[] args) {
        
        Instance_para a = new Instance_para();

        a.mission("tony", 34);


    }
    
}
