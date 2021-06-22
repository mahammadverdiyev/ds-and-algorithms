package com.hackerrank.java;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String result = doOp(n);
        System.out.println(result);
        scanner.close();
    }

    public static String doOp(final int n) {
        if (n % 2 == 1) return "Weird";
        else {
            if (n >= 2 && n <= 5) return "Not Weird";
            else if (n >= 6 && n <= 20) return "Weird";
            else return "Not Weird";
        }
    }
}