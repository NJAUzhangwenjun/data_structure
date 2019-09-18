package com.njau.recursive;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的， 并且它们的每个节点只能存储 一位 数字。
 *
 * <p>如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * <p>您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * <p>示例：
 *
 * <p>输入： (2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class EightHuangHou {

  public static void main(String[] args) {
    ListNode header = new ListNode(5);
    //    ListNode node1 = new ListNode(4);
    //    ListNode node2 = new ListNode(3);
    //    header.next = node1;
    //    node1.next = node2;
    ListNode header1 = new ListNode(5);
    //    ListNode node11 = new ListNode(6);
    //    ListNode node21 = new ListNode(4);
    //    header1.next = node11;
    //    node11.next = node21;
    Solution solution = new Solution();
    ListNode listNode = solution.addTwoNumbers(header, header1);
    System.out.println(listNode);
  }
}
/** Definition for singly-linked list. */
class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  @Override
  public String toString() {
    return "ListNode{" + "val=" + val + ", next=" + next + '}';
  }
}

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    ListNode listNode = new ListNode(-1);
    while (true) {
      if (l1.val != 0) {
        a = l1.val;
      }
      if (l2.val != 0) {
        b = l2.val;
      }
      c = a + b + d;
      d = c / 10;
      e = c % 10;
      ListNode listnode = listNode;
      while (true) {
        ListNode node = new ListNode(e);
        if (listnode.next != null) {
          listnode = listnode.next;
        } else {
          listnode.next = node;
          break;
        }
      }
      if (l1.next != null || l2.next != null) {
        if (l1.next != null) {
          l1 = l1.next;
        }
        if (l2.next != null) {
          l2 = l2.next;
        }
      } else {
        break;
      }
    }
    if (d != 0) {
      ListNode listNode1 = new ListNode(d);
      ListNode listnode = listNode;
      while (true) {
        if (listnode.next != null) {
          listnode = listnode.next;
        } else {
          listnode.next = listNode1;
          break;
        }
      }
    }
    return listNode.next;
  }
}
