package com.hackerrank.java;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(final String s, final int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 1; i < s.length() - k + 1; i++) {
            String sub = s.substring(i, i + k);
            if (smallest.compareTo(sub) > 0) smallest = sub;
            if (largest.compareTo(sub) < 0) largest = sub;
        }
        return smallest + "\n" + largest;
    }
}