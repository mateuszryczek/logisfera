package com.mime.logisfera;

import org.junit.Assert;
import org.junit.Test;

public class SecondTaskTest {

    @Test
    public void getPairs_givenCase_fourPairsFound() {
        Assert.assertEquals(4, SecondTask.getPairs(new int[]{1, 2, 10, 7, 5, 3, 6, 6, 13, 0}).size());
    }

    @Test
    public void getPairs_emptyInput_noPairsFound() {
        Assert.assertEquals(0, SecondTask.getPairs(new int[]{}).size());
    }

    @Test
    public void getPairs_largeInput_noErrorAndPairsFound() {
        int[] inputNumbers = new int[33333];
        for (int i = 0; i < 33333; i ++) {
            inputNumbers[i] = i % 13;
        }
        Assert.assertFalse(SecondTask.getPairs(inputNumbers).isEmpty());
    }

}