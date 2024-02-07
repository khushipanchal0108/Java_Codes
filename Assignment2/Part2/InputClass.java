import java.util.Scanner;

public class InputClass {
    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt(); // Read the size of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element of the array
        }
        return arr;
    }
}
