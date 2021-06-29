package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSubstringComparisonsTest {

    @Test
    void hackerrankExample1Test() {
        final String expected = "ava\nwel";
        assertEquals(expected, JavaSubstringComparisons.getSmallestAndLargest("welcometojava", 3));
    }

}