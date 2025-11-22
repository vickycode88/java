import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter your nickname: ");
        String nickname = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        System.out.print("Enter your height in meters (e.g. 1.75): ");
        float height = sc.nextFloat();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("\n--- Output Summary ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Height: " + height + "m");
        System.out.println("GPA: " + gpa);

        sc.close();
    }
}