package com.github.curriculeon;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ListNodeAdder {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String value1 = "";
        String value2 = "";
        ListNode prev1 = l1;
        ListNode prev2 = l2;
        while(prev1.next != null) {
            value1+=prev1.val;
            value2+=prev2.val;
            prev1 = prev1.next;
            prev2 = prev2.next;
        }
        Integer result = Integer.parseInt(value1) + Integer.parseInt(value2);

        ListNode current = null;
        ListNode previous = new ListNode();
        String[] digitsAsString = result.toString().split("");
        for(int i=1;i<digitsAsString.length;i++) {
            String previousDigit = digitsAsString[i-1];
            String currentDigit = digitsAsString[i];
            current = new ListNode(Integer.parseInt(currentDigit));
            previous.val = Integer.parseInt(previousDigit);
            current.next = previous;
            previous = current;
        }
        return current;
    }
}