public class ReverseTheArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr) {
        // Using 2 counter solution, one counter a the beginning and one at the end and
        // start swapping each of them and increase the first counter and decrease the
        // last counter by 1 after each swap.
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}