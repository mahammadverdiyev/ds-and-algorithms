package com.leetcode.linked_list;

public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
    }

    public Node(T val, Node<T> next) {
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return this.val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}