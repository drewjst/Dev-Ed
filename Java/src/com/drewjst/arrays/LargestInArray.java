package com.drewjst.arrays;

public class LargestInArray {

    /**
     * O(n) solution to find the largest value in an integer array
     * @param values Integer array
     * @return largest value
     */
    public static int getLargestIntValue(int[] values) {
        int largestNumber = values[0];

        for (int num : values) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }
        return largestNumber;
    }

    public static int getLargestIntValueEndtoEnd(int[] values) {
        int largestNumber = values[0];
        int endIterator = values.length - 1;

        for (int i = 0; i < values.length; i++) {
            if (i == endIterator) {
                if (values[i] > largestNumber) {
                    largestNumber = values[i];
                    return largestNumber;
                }
                return largestNumber;
            }

            if (values[i] > largestNumber) {
                largestNumber = values[i];
            }
            if (values[endIterator] > largestNumber) {
                largestNumber = values[endIterator];
            }
            endIterator--;
        }
        return largestNumber;
    }

    /**
     * Print the largest value in an integer array
     * @param values Integer Array
     */
    public static void printLargestIntValue(int[] values) {
        int largestNumber = values[0];

        for (int num : values) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }
        System.out.println("Largest Integer Value: " + largestNumber);
    }
}
