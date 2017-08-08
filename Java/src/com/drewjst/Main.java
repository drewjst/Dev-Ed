package com.drewjst;

import com.drewjst.utilities.ArrayUtil;
import com.drewjst.arrays.LargestInArray;
import com.drewjst.utilities.TimingUtil;

public class Main {
    private static TimingUtil time = new TimingUtil();

    public static void main(String[] args) {
        testLargestInArrays();
    }


    private static void testLargestInArrays() {
        int[] testArray;
        int temp;

        testArray = ArrayUtil.randomIntArray(50000000, 1000);

        time.startTime();
        temp = LargestInArray.getLargestIntValue(testArray);
        time.endTime();

        System.out.println("Total Time Span: Linear largest in the array: " + time.getElapsedTime());
        System.out.println("Largest Value: " + temp);

        time.startTime();
        temp = LargestInArray.getLargestIntValueEndtoEnd(testArray);
        time.endTime();

        System.out.println("Total Time Span: E2E largest in the array:" + time.getElapsedTime());
        System.out.println("Largest Value: " + temp);
    }
}


