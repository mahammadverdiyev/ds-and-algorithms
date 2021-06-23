package com.hackerrank.java;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class JavaDateAndTimeTest {

    @Test
    void hackerrankExample1Test() {
        assertEquals(
                DayOfWeek.WEDNESDAY.toString(),
                JavaDateAndTime.findDay(8, 5, 2015)
        );
    }

    @Test
    void myTest1() {

        assertThrows(
                DateTimeException.class,
                () -> JavaDateAndTime.findDay(13, 5, 2021)
        );
    }

}