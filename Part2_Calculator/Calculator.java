import java.util.Scanner;

public class Calculator
{
    public double addition(double n1, double n2) {
        return n1 + n2;
    }

    public double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return n1 / n2;
    }

    public double sqrt(double n) {
        return Math.sqrt(n);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Calculate the mean of an array of numbers
    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double variance(double[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Insufficient data to calculate variance.");
            return Double.NaN;
        }

        double mean = mean(numbers);
        double sumSquaredDifferences = 0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / (numbers.length - 1); // Use (n-1) for sample variance
    }
}


