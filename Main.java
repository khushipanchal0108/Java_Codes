import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int continueOperation; // Variable to control the loop

        do {
            System.out.println("Enter two numbers:");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            double[] numbers = new double[]{number1, number2}; // Assuming you want to use these for operations

            System.out.println("First Number: " + numbers[0] + " Second number: " + numbers[1]);
            System.out.println("---------Operations--------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Mean");
            System.out.println("4. Variance");
            System.out.println("5. Multiplication");
            System.out.println("6. Division");
            System.out.println("7. sqrt");
            System.out.println("8. pow");

            System.out.println("Enter your option:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Addition is: " + calc.addition(numbers[0], numbers[1]));
                    break;
                case 2:
                    System.out.println("Subtraction is: " + calc.subtraction(numbers[0], numbers[1]));
                    break;
                case 3:
                    System.out.println("Mean is: " + calc.mean(numbers));
                    break;
                case 4:
                    System.out.println("Variance is: " + calc.variance(numbers));
                    break;
                case 5:
                    System.out.println("Multiplication is: " + calc.multiplication(numbers[0],numbers[1]));
                    break;
                case 6:
                    System.out.println("Division is: " + calc.division(numbers[0],numbers[1]));
                    break;
                case 7:
                    System.out.println("sqrt is: " + calc.sqrt(numbers[0]));
                    break;
                case 8:
                    System.out.println("power is: " + calc.power(numbers[0],numbers[1]));
                    break;
                default:
                    System.out.println("Invalid option");
            }

            // Ask the user if they want to perform another operation
            System.out.println("Do you want to perform another operation? (1/0)");
            continueOperation = scanner.nextInt(); // Read the user's response

        } while (continueOperation==1); // Continue if the user inputs "yes"

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
