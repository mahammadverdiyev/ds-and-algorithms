package com.leetcode.problems.add_two_numbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbersV1(ListNode l1, ListNode l2) {
        int num1 = getNum(l1);
        int num2 = getNum(l2);
        System.out.println(num1);
        System.out.println(num2);
        int sum = num1 + num2;
        return createLinkedList(sum);
    }

    private int getNum(ListNode head) {
        ListNode curr = head;
        int flat = 0;
        int num = 0;
        while (curr != null) {
            num += (curr.val * Math.pow(10, flat++));
            curr = curr.next;
        }
        return num;
    }

    private ListNode createLinkedList(int sum) {
        ListNode head = new ListNode(sum % 10, null);
        ListNode curr = head;
        sum /= 10;
        while (sum > 0) {
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            sum /= 10;
        }
        return head;
    }

    public ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {
        int surplus = 0;
        int i = 0;
        ListNode head;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + surplus;
            int nodeValue = (sum) / 10;
            surplus = sum % 10;
            ListNode curr = new ListNode(nodeValue);
            if (i++ == 0) head = curr;
            l1 = l1.next;
            l2 = l2.next;
        }
        throw new RuntimeException("should be implemented!");
    }

}