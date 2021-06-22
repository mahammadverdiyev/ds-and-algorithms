package com.hackerrank.java;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int count = 1;
        while (scan.hasNext()) System.out.println(count++ + " " + scan.nextLine());
    }
}