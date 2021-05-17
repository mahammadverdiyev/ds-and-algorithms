package com.leetcode.problems.array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    public static void duplicateZeros(int[] arr) {
        int countOfZeros = 0;
        for (int j : arr) if (j == 0) countOfZeros++;
        int len = arr.length;
        int[] duplicated = new int[len + countOfZeros];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) duplicated[j] = duplicated[j++ + 1] = 0;
            else duplicated[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(duplicated));
    }
}
