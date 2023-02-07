package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberPerformanceTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private int max = 10;
    private MissingNumber mn = new MissingNumber();

    @Test(timeout=100)
    public void testMissingNumberPerformance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumber(missingMax, max);
            mn.missingNumber(missingNone, max);
            mn.missingNumber(missingSeven, max);
        }
    }

    @Test(timeout=100)
    public void testMissingNumberSortPerformance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumberSort(missingMax, max);
            mn.missingNumberSort(missingNone, max);
            mn.missingNumberSort(missingSeven, max);
        }
    }

    @Test(timeout=100)
    public void testMissingNumberSumPerformance() {
        for (int i = 0; i < 1000000; i++) {
            mn.missingNumberSum(missingMax, max);
            mn.missingNumberSum(missingNone, max);
            mn.missingNumberSum(missingSeven, max);
        }
    }
}
