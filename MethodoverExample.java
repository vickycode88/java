class Printe {
    
    void print() {
        System.out.println("Nothing to print");
    }

    void print(int e,int f, int g) {
        int mul=e*f*g;
        System.out.println("multiply : "+ mul);
    }

    void print(int number) {
        
        int sq=number*number;
        System.out.println("square : " + sq);
    }

     void print(int a,int b) {
        
       int d = a/b;
       System.out.println("divide : "+ d);
    }

     void print(int e,int f,int q,int s) {
        int add=e+f+q+s;
        System.out.println("addition : "+ add);
    }
   

    public static void main(String[] args) {
        Printe p = new Printe();
        p.print(12);
        p.print(4,2);
        p.print(3,2,4);
        p.print(4,7,8,8);
       
       
        
    }
}