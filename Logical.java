public class Logical {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        boolean resultAnd = x && y;
        System.out.println("Logical AND: " + resultAnd);

        boolean resultOr = x || y;
        System.out.println("Logical OR: " + resultOr);

        boolean resultNotx = !x;
        boolean resultNoty = !y;

        System.out.println("Logical Not for x: "+resultNotx);
        System.out.println("Logical Not for x:"+resultNoty);

    }

}
