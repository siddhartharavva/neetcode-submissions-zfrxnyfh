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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode prev = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;
            if (l1 != null) {
                l1.val = sum % 10;
                prev = l1;
                l1 = l1.next;
            } else {                
                prev.next = l2;
                l2.val = sum % 10;
                prev = l2;
                l2 = l2.next;
                l1 = prev.next;
            }
            carry = sum / 10;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0)prev.next = new ListNode(carry);        
        return head;
    }
}



/*class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;
        }

        return dummy.next;
    }
}*/