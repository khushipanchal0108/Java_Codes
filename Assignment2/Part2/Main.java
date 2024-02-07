public class Main {
    public static void main(String[] args) {
        int[] array = InputClass.getArray();
        int index = MethodClass.findClosestNeighboursIndex(array);
        System.out.println("Index of the first number among the closest neighbors: " + index);
    }
}