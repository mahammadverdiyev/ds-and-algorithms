package com.leetcode.linked_list;

public class MyLinkedList {
    public Node head;
    public int size;

    public MyLinkedList() {
        super();
        this.head = null;
        this.size = 0;
    }

    public int get(final int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.val;
    }

    public void addAtHead(final int val) {
        head = new Node(val, head);
        size++;
    }

    public void addAtTail(final int val) {
        final Node newTail = new Node(val);
        if (size == 0) head = newTail;
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newTail;
        size++;
    }

    public void addAtIndex(final int index, final int val) {
        if (index < 0 || index > size) return;
        if (index == size) addAtTail(val);
        else {
            final Node newNode = new Node(val);
            Node curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            newNode.setNext(curr.next);
            curr.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) head = head.next;
        else {
            Node curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            curr.next = curr.next.next;
        }
        size--;
    }

}
