package com.leetcode.linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    private MyLinkedList myLinkedList;

    @BeforeEach
    public void initialize() {
        this.myLinkedList = new MyLinkedList();
    }

    @Test
    public void leetcodeExample1Test() {
        assertEquals(0, this.myLinkedList.getSize());
        assertNull(this.myLinkedList.getHead());
        this.myLinkedList.addAtHead(1);
        assertEquals(1, this.myLinkedList.getSize());
        assertEquals(1, this.myLinkedList.getHead().getVal());
        assertEquals(1, this.myLinkedList.get(0));
        assertEquals(-1, this.myLinkedList.get(1));
        this.myLinkedList.addAtTail(3);
        assertEquals(2, this.myLinkedList.getSize());
        assertEquals(1, this.myLinkedList.getHead().getVal());
    }

}