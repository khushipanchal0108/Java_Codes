import java.util.Scanner;
public class Part1_2
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input first rational number
            System.out.print("Enter first rational number (in the form a/b): ");
            String[] input1 = scanner.next().split("/");
            int num1 = Integer.parseInt(input1[0]);
            int den1 = Integer.parseInt(input1[1]);

            // Input second rational number
            System.out.print("Enter second rational number (in the form a/b): ");
            String[] input2 = scanner.next().split("/");
            int num2 = Integer.parseInt(input2[0]);
            int den2 = Integer.parseInt(input2[1]);

            // Create RationalNumber objects
            RationalNumbers rational1 = new RationalNumbers(num1, den1);
            RationalNumbers rational2 = new RationalNumbers(num2, den2);

            // Perform operations
            System.out.println("Addition: " + rational1.add(rational2));
            System.out.println("Subtraction: " + rational1.subtract(rational2));
            System.out.println("Multiplication: " + rational1.multiply(rational2));
            try {

                System.out.println("Division: " + rational1.divide(rational2));
                System.out.println("Comparison: " + rational1.compareTo(rational2));
                System.out.println("Floating Point Value of First Rational Number: " + rational1.tofloat());
                System.out.println("Floating Point Value of second Rational Number: "+rational2.tofloat());
                System.out.println("Absolute Value of First Rational Number: " +"|"+rational1+"|"+"= "+ rational1.abs());
                System.out.println("Absolute Value of Second Rational Number: "+"|"+rational2+"|"+"= "+rational2.abs());


            } catch (ArithmeticException e)
            {
                System.out.println("Division by zero is not allowed.");
            }

        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid input format. Please provide rational numbers in the form a/b.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Input Error"+e.getMessage());
        }
        scanner.close();
    }
}

