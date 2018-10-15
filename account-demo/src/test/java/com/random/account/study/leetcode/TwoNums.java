package com.random.account.study.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TwoNums {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = map.get(target - nums[i]);
            if (num != null) {
                return new int[]{num, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static boolean isResertNum(int num) {
        int resertNum = 0;
        for (; num != 0; num = num / 10) {
            resertNum = resertNum * 10 + num % 10;
        }
        return resertNum == num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 9};
        int[] numss = TwoNums.twoSum(nums, 9);
        System.out.println(numss.toString());
    }
}
