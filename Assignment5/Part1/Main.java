import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        Circle c = new Circle(radius);
        System.out.printf("Circle Area is %.2f\n", c.calculateArea());
        System.out.printf("Circle Perimeter is %.2f\n\n", c.calculatePerimeter());

        // Triangle
        System.out.print("Enter the sides of the triangle (a b c): ");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        Triangle t = new Triangle(sideA, sideB, sideC);
        System.out.printf("Triangle Area is %.2f\n", t.calculateArea());
        System.out.printf("Triangle Perimeter is %.2f\n\n", t.calculatePerimeter());

        // Rectangle
        System.out.print("Enter the length and breadth of the rectangle (length breadth): ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle r = new Rectangle(length, width);
        System.out.printf("Rectangle Area is %.2f\n", r.calculateArea());
        System.out.printf("Rectangle Perimeter is %.2f\n", r.calculatePerimeter());

        scanner.close();
    }
}
