import java.util.Arrays;

public class FindKLargest {


    public static final FindKLargest instance = new FindKLargest();

    private FindKLargest() {
    }

    public static FindKLargest getInstance() {
        return instance;
    }


    // basic use case O(n)
    public int firstLargest(int size, int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        return max;
    }


    // naive O(nlogn) solution, sort and get k largest element
    public int kLargest(int size, int[] arr, int k) {

        Arrays.sort(arr);
        return arr[size - k];

    }
}
