package com.muliulan.mll;

/**
 * 描述:
 * zhaochenshuo
 * 2021/3/29
 */

public class Dsssss {


    void dd() {
        int a = 0b011110101;
        a = ~a;

    }

    public boolean searchMatrix(int[][] matrix, int target) {


        for (int[] ints : matrix) {
            int anInt = ints[0];
            int anInt1 = ints[ints.length - 1];
            if (target >= anInt && target <= anInt1) {
                for (int i : ints) {
                    if (i == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
