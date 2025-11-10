
class Calculator {
    int a;
    int b;
    Calculator(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int div = a/b;
        int area = (a * b) / 2;  

        
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("dive : "+ div);
        System.out.println("Area of Triangle: " + area);
    }

      public static void main(String[] args) {
        
        Calculator calc = new Calculator(10, 5);
    }
}


  

