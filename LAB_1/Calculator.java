public class Calculator {
    public int n1, n2;
    public int choice;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ArithmaticOperations operations = new ArithmaticOperations();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter choice (1-5): ");

        while (calculator.choice > 0 ) {
            calculator.choice = scanner.nextInt();
            System.out.print("Enter the first no.: ");
            calculator.n1 = scanner.nextInt();
            System.out.print("Enter the second no.: ");

            calculator.n2 = scanner.nextInt();
            switch (calculator.choice) {
                case 1:
                    System.out.println("Addition: " + operations.addNums(calculator.n1, calculator.n2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + operations.subNums(calculator.n1, calculator.n2));
                    break;
                case 3:
                    System.out.println("Multiplication: " + operations.multiplyNums(calculator.n1, calculator.n2));
                    break;
                case 4:
                    System.out.println("Division: " + operations.divideNums(calculator.n1, calculator.n2));
                    break;
                case 5:
                    System.out.println("Modulus: " + operations.modulusNums(calculator.n1, calculator.n2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }
        scanner.close();
    }
}
