package com.leetcode.linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListAppTest {
    private MyLinkedList myLinkedList;

    @BeforeEach
    private void initialize() {
        this.myLinkedList = new MyLinkedList();
    }

    @Test
    private void leetcodeExample1Test() {
        assertEquals(0, this.myLinkedList.getSize());
        assertNull(this.myLinkedList.getHead());
//        this.myLinkedList.addAtHead(1);
    }

}