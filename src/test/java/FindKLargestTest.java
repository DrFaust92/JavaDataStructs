import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class FindKLargestTest {

    FindKLargest largest = FindKLargest.getInstance();

    private int[] arrayGenerator(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }

        return array;
    }

    @Test
    public void firstLargestRandom() {

        int size = 10;

        int[] arr = arrayGenerator(size);
        int actualMax = largest.firstLargest(size, arr);

        Arrays.sort(arr);

        int expectedMax = arr[size - 1];

        Assert.assertEquals("hello", actualMax, expectedMax);


    }


    @Test
    public void kLargest() {
    }
}