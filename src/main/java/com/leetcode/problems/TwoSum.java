package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
//        return bruteForce(nums, target);
//        return memorizedV1(nums, target);
        return memorizedV2(nums, target);
    }

    private int[] bruteForce(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++)
            for (int j = i + 1; j < len; j++)
                if ((nums[i] + nums[j]) == target)
                    return new int[]{i, j};
        throw new IllegalArgumentException("No solution!");
    }

    private int[] memorizedV1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            int searchedValue = target - nums[i];
            Integer searchedValueIndex = map.get(searchedValue);
            if (searchedValueIndex != null && searchedValueIndex != i) return new int[]{i, searchedValueIndex};
        }
        throw new IllegalArgumentException("No solution!");
    }

    private int[] memorizedV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchedValue = target - nums[i];
            if (map.containsKey(searchedValue)) return new int[]{map.get(searchedValue), i};
            else map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution!");
    }

}