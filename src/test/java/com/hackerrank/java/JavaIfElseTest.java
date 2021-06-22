package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaIfElseTest {

    @Test
    void hackerrankExample1Test() {
        assertEquals("Weird", JavaIfElse.doOp(3));
    }

    @Test
    void hackerrankExample2Test() {
        assertEquals("Not Weird", JavaIfElse.doOp(24));
    }


}