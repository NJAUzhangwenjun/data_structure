package com.leetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);

        head1.next = l1;
        head2.next = l1;
        ListNode tempt = head1;
        ListNode pre2 = head2;
        while (tempt.next != null) {
            while (pre2.next != null) {
                if (tempt.next.val < pre2.next.val) {
                    ListNode next = pre2.next.next;
                    tempt.next.next = tempt.next;
                    pre2.next = tempt.next;
                }
            }
        }
        return null;
    }
}

