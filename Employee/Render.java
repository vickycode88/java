package Employee;

public class Render {


    public static void main(String[] args) {
        
        Fulltime f = new Fulltime(30000, 5000, 3000);

        System.out.println("full time annual salary : "+f.Full());

        Parttime p = new Parttime(80, 180);
        System.out.println("Part time annual salary : "+ p.Part());

    }
}
