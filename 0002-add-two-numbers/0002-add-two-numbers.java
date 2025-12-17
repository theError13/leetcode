/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertAtTail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null)
            return newNode;

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currNode1 = l1;
        ListNode currNode2 = l2;
        ListNode dummy = new ListNode(); // head giả
        ListNode list = dummy;
        int k = 0;
        boolean carry = false;
        while (currNode1 != null || currNode2 != null||carry) {
            if (currNode1 != null) {
                k += currNode1.val;
                currNode1 = currNode1.next;
            }
            if (currNode2 != null) {
                k += currNode2.val;
                currNode2 = currNode2.next;
            }
            if (carry) {
                k = k + 1;
            }
            if (k > 9) {
                k = k % 10;
                carry = true;
            } else {
                carry = false;
            }
            insertAtTail(dummy, k);
            k = 0;
        }
        return dummy.next;
    }
}