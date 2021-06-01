package com.muliulan.mll;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 描述:
 * 0 1 2 3 4 5 6 7 8 9
 * 1 1 2 2 3 3 4 4
 * 0 1 1 2 2 1 2 2
 * <p>
 * 2021/3/29
 */

public class Dsssss extends Activity {


    int hammingWeight(int n) {
        char[] chars = (n + "").toCharArray();
        int a=0;
        for (char aChar : chars) {
            if(aChar=='1'){
                a++;
            }
        }

        Integer.bitCount(1);
        return a;
    }
}
