package com.shopping.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 描述:
 * zhaochenshuo
 * 2021/2/22
 */

public class DAAAAA {


    int[] sums;

    public void NumArray(Integer[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }

        Arrays.sort(nums, (a, b) -> b-a);


    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
