package com.hackerrank.java;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String s = in.next();
        final int start = in.nextInt();
        final int end = in.nextInt();
        System.out.println(s.substring(start, end));
    }
}