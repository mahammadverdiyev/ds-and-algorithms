package com.hackerrank.java;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String s = sc.next();

        System.out.println(isPalindrome(s.toCharArray()));

    }

    private static String isPalindrome(char[] chars) {
        int len = chars.length - 1;
        for (int i = 0; i <= len; i++) {
            if (chars[i] != chars[len - i]) return "No";
        }
        return "Yes";
    }
}