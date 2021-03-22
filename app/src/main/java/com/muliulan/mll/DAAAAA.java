package com.muliulan.mll;

import android.util.Log;

/**
 * 描述:
 * zhaochenshuo
 * 2021/2/22
 */

public class DAAAAA {

    public static void dd() {
        int a = 2, b = 4, c = 8;

        int i = a ^ b;

        Log.e("mllll111", (i ^ a) + "   " + (i ^ 3));


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        Log.e("mllll222", a + " " + b);
//
//        int i1 = b | c;
//        Log.e("mllll333", i1 + " " + (i1 & a) + " " + (i1 & b) + " " + (i1 & c));

    }

    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m - 1; i >= 0; i--) {
            char sChar = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}
