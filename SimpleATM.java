import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {

        int balance = 10000; 
        int withdraw, deposit;
        int accountNumber = 12345; 
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Welcome to the ATM -----");
        System.out.print("Enter your Account Number: ");
        int enteredAccount = sc.nextInt();

       
        if (enteredAccount == accountNumber) {
            System.out.println("Account verified successfully!\n");

            while (true) {
                System.out.println("\n----- ATM Machine -----");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Your current balance is: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your cash.");
                            System.out.println("Remaining balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("₹" + deposit + " deposited successfully!");
                        System.out.println("Updated balance: ₹" + balance);
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        System.exit(0); 
                        break;

                    default:
                        System.out.println("Invalid Option! Please try again.");
                }
            }

        } else {
            System.out.println("Invalid Account Number! Access Denied.");
        }
    }
}
