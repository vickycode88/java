import java.util.Scanner;

class dowhilesumofdigit {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num:");

        int num  = sc.nextInt();

        int sum=0;

        do{
            
            int digit = num%10;
            sum = sum+digit;
            num=num/10;
            
        }while(num>0);

        System.out.println("sum of number"+sum);    

    }
    
}
