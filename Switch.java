public class Switch {
    public static void main(String[] args) {
        System.out.println("Switch");

        String fruit = "apple";

        switch (fruit) {
            case "banana":
                System.out.println("banana is yellow");

                break;
            case "apple":
                System.out.println("apple is red");

                break;
            case "orange":
                System.out.println("orange is orange");

                break;
            default:
                System.out.println("i don't know");
        }
    }

}
