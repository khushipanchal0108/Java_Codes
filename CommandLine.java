import java.io.*;

public class CommandLine
{
    public static void main(String[] args)
    {
        // using command line to take input
        int number = Integer.parseInt(args[0]);
        Factorial f = new Factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of " + number + " is " + result + " using Command Line Argument");
    }
}
