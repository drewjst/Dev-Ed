package com.drewjst.utilities;

import java.util.Random;

/**
 * Utility methods for array manipulation
 */
public class ArrayUtil {
    private static Random randomGenerator = new Random();

    /**
     * Creates an integer array filled with random values
     * @param length the length / size of the array
     * @param n number of possible random values
     * @return an integer array with numbers between 0 and n - 1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = randomGenerator.nextInt(n);
        }

        return arr;
    }

    /**
     * Swaps two entries of an array
     * @param a the array
     * @param first first position to swap
     * @param second second position to swap
     */
    public static void swapEntriesOfIntArray(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }


}
