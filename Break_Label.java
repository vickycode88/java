public class Break_Label {

    public static void main(String[] args) {
        System.out.println("unlabeled");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 2) {
                    break;
                }
                System.out.println("i=" + i + "j=" + j);
            }
        }

        System.out.println("Unlabeled Break");
        outer:
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 2) {
                    break outer;
                }
                System.out.println("i=" + i + "j=" + j);
            }
        }

    }

}
