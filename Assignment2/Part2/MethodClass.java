public class MethodClass {
    public static int findClosestNeighboursIndex(int[] arr) {
        if (arr == null || arr.length < 2) return -1; // Ensure array has at least two elements
        int index = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }
        return index;
    }
}