package com.leetcode.linked_list;

public class Node<T> {
    private final T val;
    private Node<T> next;

    public Node(T val) {
        this(val, null);
    }

    public Node(T val, Node<T> next) {
        super();
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("Node{val=%s, next=%s}", val, next);
    }
}