class If {

    public static void main(String[] args) {
        System.out.println("if statement");
        if (2 < 4) {

            System.out.println("2 is smaller than 4");
        }

        System.out.println();
        System.out.println("Nested if");
        if (10 < 20) {

            System.out.println("10 is smaller");
            if (5 > 4) {
                System.out.println("5 is greater");

            }

            if (2 > 1) {
                System.out.println("2 is greater");
            }
        }
    }
}

