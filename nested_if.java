public class nested_if {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("normal if else");
        if (5 < 4) {
            System.out.println("greater");
        } else {
            System.out.println("smaller");
        }

        System.out.println();

        System.out.println("nested if else");
        if (5 > 4) {
            System.out.println("5 is greater");
            if (6 > 7) {
                System.out.println("6 is greater");
            } else {
                if (7 > 8) {
                    System.out.println("7 is greater");
                } else {
                    System.out.println("8 is greater");
                }
            }
        }

    }
}
