package com.hackerrank.ipk.one_week_prep.day1;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        final int size = arr.size();
        double posCount = 0;
        double negCount = 0;
        double zeroCount = 0;
        for (int num : arr) {
            if (num > 0) posCount++;
            else if (num < 0) negCount++;
            else zeroCount++;
        }
        System.out.printf("%.6f\n", posCount/size);
        System.out.printf("%.6f\n", negCount/size);
        System.out.printf("%.6f\n", zeroCount/size);
    }

    public static void main(String[] args) {
        plusMinus(Arrays.asList(1,1,0,-1,-1));
    }
}