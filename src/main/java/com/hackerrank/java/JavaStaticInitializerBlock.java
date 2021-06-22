package com.hackerrank.java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static final boolean flag;
    private static final int B;
    private static final int H;

    static {
        final Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        flag = (B > 0 && H > 0);
    }

    public static void main(String[] args) {
        System.out.println(
                flag ? B * H : "java.lang.Exception: Breadth and height must be positive"
        );
    }
}