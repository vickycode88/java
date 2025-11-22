public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 8);
        System.out.println("area of rectangle : "+r.area());
        System.out.println("area of rectangle parameter : "+r.parameter());


        Circle c = new Circle(4);
        System.out.println("area of circle : "+ c.area());
        System.out.println("area of circle parameter : "+ r.area());


    }
}
