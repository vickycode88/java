public class Ternary {
    public static void main(String[] args) {
        
        int a=10;
        int b=20;

        int maxIfElse;

        if (a>b) {

            maxIfElse=a;
            
        } else {

            maxIfElse=b; 
            
        }

        System.out.println(maxIfElse);

        int maxTernary = (a>b)? a:b;
        System.out.println(maxTernary);
    }
}
