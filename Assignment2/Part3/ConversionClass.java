import java.util.ArrayList;

public class ConversionClass {
    public static ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int element : array) {
            arrayList.add(element);
        }
        return arrayList;
    }

    public static int[] arrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}