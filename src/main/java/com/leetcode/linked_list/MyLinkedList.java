package com.leetcode.linked_list;

public class MyLinkedList {
    private Node<Integer> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) return -1;
        Node<Integer> curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getVal();
    }
}