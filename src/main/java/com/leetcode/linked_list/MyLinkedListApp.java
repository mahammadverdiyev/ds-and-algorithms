package com.leetcode.linked_list;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list + "\n");

        list.addAtHead(1);
        System.out.println(list + "\n");

        list.addAtTail(3);
        System.out.println(list + "\n");

        list.addAtIndex(1, 2);
        System.out.println(list + "\n");

        System.out.println(list.get(1));
        System.out.println(list + "\n");

        list.deleteAtIndex(1);
        System.out.println(list + "\n");

        System.out.println(list.get(1));
        System.out.println(list + "\n");
    }
}