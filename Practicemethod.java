import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter array: ");
        int size = sc.nextInt();  
        int[] arr = new int[size];  

        System.out.println("Enter a element: "+size);

        
        for (int i= 0;i<size;i++) {
            arr[i] = sc.nextInt();  
        }

        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();  
    }
}