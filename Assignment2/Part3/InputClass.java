import java.util.Scanner;

public class InputClass {
    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // It's a good practice to close the Scanner, but we'll keep it open if reading from System.in throughout the application lifecycle.
        return array;
    }
}