package com.random.account.study.leetcode;

/**
 * 是否是回文
 * <p>输入一个123321返回true</p>
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int copy = 0;
        int prev = x;
        for (x = x; x != 0; x /= 10) {
            copy = copy * 10 + x % 10;
        }
        return copy == prev;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }

}
