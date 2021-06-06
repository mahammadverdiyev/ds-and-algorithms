package com.leetcode.linked_list;

public class MyLinkedList {
    private int size;
    private Node<Integer> head;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) return -1;
        Node<Integer> curr = this.head;
        for (int i = 0; i < index; i++) curr = curr.getNext();
        return curr.getVal();
    }

    public void addAtHead(int val) {
        this.head = new Node<>(val, this.head);
        this.size++;
    }

    public void addAtTail(int val) {
        final Node<Integer> newTail = new Node<>(val);
        if (this.size == 0) this.head = newTail;
        Node<Integer> curr = this.head;
        while (curr.getNext() != null) curr = curr.getNext();
        curr.setNext(newTail);
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) return;
        if (index == this.size) addAtTail(val);
        else {
            Node<Integer> curr = this.head;
            for (int i = 0; i < index - 1; i++) curr = curr.getNext();
            final Node<Integer> newNode = new Node<>(val);
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
            this.size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) return;
        if (index == 0) this.head = this.head.getNext();
        else {
            Node<Integer> curr = this.head;
            for (int i = 0; i < index - 1; i++) curr = curr.getNext();
            curr.setNext(curr.getNext().getNext());
            this.size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<Integer> getHead() {
        return head;
    }

    public void setHead(Node<Integer> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return String.format("MyLinkedList[size=%d, head=%s]", size, head);
    }
}
