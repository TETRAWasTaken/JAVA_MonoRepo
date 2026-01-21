import java.util.Scanner;

public class ArithmaticOperations {
    public int n1, n2;

    //method to add two numbers
    public double addNums(int a, int b){
        return (double) a + b;
    }

    //method to substract two numbers
    public double subNums(int a, int b){
        return (double) a - b;
    }

    //method to multiply two numbers
    public double multiplyNums(int a, int b){
        return (double) a * b;
    }

    //method to divide two numbers
    public double divideNums(int a, int b){
        if ( b == 0 ) {
            System.out.println("Error: Division by Zero");
            return -1;
        }
        return (double) a / b;
    }

    //method to find the modulus of the number 
    public double modulusNums(int a, int b){
        if ( b == 0 ) {
            System.out.println("Error: Division by Zero");
            return -1;
        }
        return (double) (a % b);
    }

    public static void main(String args[]) {
        ArithmaticOperations operations = new ArithmaticOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        operations.n1 = scanner.nextInt();
        System.out.print("Enter the second no.: ");
        operations.n2 = scanner.nextInt();

        System.out.println("Addition: " + operations.addNums(operations.n1, operations.n2));
        System.out.println("Subtraction: " + operations.subNums(operations.n1, operations.n2));
        System.out.println("Multiplication: " + operations.multiplyNums(operations.n1, operations.n2));
        System.out.println("Division: " + operations.divideNums(operations.n1, operations.n2));
        System.out.println("Modulus: " + operations.modulusNums(operations.n1, operations.n2));


        scanner.close();
    }
}
