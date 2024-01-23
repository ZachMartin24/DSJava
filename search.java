import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class search {

    public static int linearSearch(int[] array, int tgtVal) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        final int arraySize = 10000000;
        int[] array = new int[arraySize];
        Random random = new Random();

        System.out.println("Array size: " + arraySize);

        int key = random.nextInt(arraySize) + 1;
        System.out.println("Key is equal to " + key);
        // int key = (int) (arraySize * Math.random()) + 1;
        // System.out.println("key is equal to " + key);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(arraySize) + 1;
        }

        // System.out.println("array = " + Arrays.toString(array));

        long start, end, searchTime;
        start = System.currentTimeMillis();
        int ret;
        ret = linearSearch(array, key);
        end = System.currentTimeMillis();
        searchTime = end - start;
        System.out.println(" Linear search took " + (end - start) + " milliseconds ");

        if (ret < 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + ret);
        }
        Arrays.sort(array);

        start = System.currentTimeMillis();
        ret = Arrays.binarySearch(array, key);
        end = System.currentTimeMillis();
        System.out.println("Binary Search took " + (end - start) + " milliseconds ");
        if (ret < 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + ret);
        }

    }
}
