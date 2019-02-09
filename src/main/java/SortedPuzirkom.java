public class SortedPuzirkom {
    public static void main(String[] args) {

        int[] arr = {10, 5, 15, 0, -4};

        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
        }
    }
}
