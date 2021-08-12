package com.hackerrank.ipk.one_week_prep.day1;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        final int size = arr.size();
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = min;

        for (int i = 1; i < arr.size(); i++) {
            long num = arr.get(i);
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        System.out.printf("%d %d", (sum - max), (sum - min));
    }
}
