import java.util.Scanner;
class A {
    public static void main(String[] args) {

        // OneDarray

        // int[] numbers ;
        // numbers = new int[2];

        // numbers[0]=1;
        // numbers[1]=2;

        // // System.out.println(numbers.length);

        // // for(int i=0;i<numbers.length;i++){
        // // System.out.println(numbers[i]);
        // // }

        // String[] name = {"smith","harshal"};

        // // for(int i=0;i<name.length;i++){
        // // System.out.println(name[i]);
        // // }

        // for(String names : name){
        // System.out.println(names);
        // }

        // TwoDarray

        // int[][] numbers = {

        // {1,2,3},
        // {4,5,6},
        // {7,8,9}
        // };

        // System.out.println(numbers.length);
        // System.out.println(numbers[0].length);

        // for(int i=0;i<numbers.length;i++){
        // for(int j=0;j<numbers[i].length;j++){

        // System.out.print(numbers[i][j]+" ");

        // }
        // System.out.println();
        // }

        // for(int[] row : numbers ){
        // for(int value : row){
        // System.out.print(value+" ");
        // }
        // System.out.println();
        // }

        // Scanner sc = new Scanner(System.in); // Create Scanner object

        // System.out.print("Enter the size of the array: ");
        // int size = sc.nextInt(); // Take size of array

        // int[] arr = new int[size]; // Create array of given size

        // System.out.println("Enter " + size + " elements:");

        // // Input values using a loop
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt(); // Take input for each element
        // }

        // // Display the array
        // System.out.println("The array elements are:");
        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // sc.close(); // Close the scanner


         Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Step 1: Ask for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create 2D array
        int[][] arr = new int[rows][cols];

        // Step 3: Input elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 4: Print the 2D array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }

        sc.close();  // Close the scanner
    }
}