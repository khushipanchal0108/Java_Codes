import java.util.Scanner;

public class Input {
    public double[] inputNumbers() {
        double numbers[] = new double[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        numbers[0] = sc.nextDouble();

        System.out.println("Enter second number: ");
        numbers[1] = sc.nextDouble();

        return numbers;
    }
}
