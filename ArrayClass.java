
public class ArrayClass {

    public static int search(int[] arr, int val) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (val == arr[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = minIdx + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
}
