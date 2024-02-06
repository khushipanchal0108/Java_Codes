import java.io.*;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // taking Scanner class to take input
        System.out.print("Enter number to find factorial: ");
        int number = scanner.nextInt(); // taking input as integer
        Factorial f = new Factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of " + number + " is " + result + " using Scanner");
        // Close the Scanner
        scanner.close();
    }
}