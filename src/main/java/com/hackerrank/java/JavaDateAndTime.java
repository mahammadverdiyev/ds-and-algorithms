package com.hackerrank.java;

import java.time.DateTimeException;
import java.time.LocalDate;

public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) throws DateTimeException {
        return LocalDate
                .of(year, month, day)
                .getDayOfWeek()
                .toString();
    }
}