public class Instance {

    public static void main(String[] args) {
        
        System.out.println("Main Method");


        Instance a = new Instance();
        a.aven();
        

        
    }

    static void rocket(){
        System.out.println("mission is started");
    }

    void aven(){
        System.out.println("wow");
        rocket();
    }
    
}
